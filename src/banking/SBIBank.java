package banking;

public class SBIBank implements RBI_Banking_System
{

    private String accNo;

    private String passCode;

    private double rateOfInterest=6;

    private double balance;

    private int minimum_balance=500;

    public SBIBank(String accNo,String passCode,double balance)
    {
        this.accNo=accNo;
        this.balance=balance;
        this.passCode=passCode;
    }




    public String AddMoney(int money)
    {
        if(money>0)
        {
            balance=balance+money;

            return "Money : "+ money +" has been added to your account.Total balance is " +balance;
        }
        else
            return "Money entered is negative";
    }

    public String WithdrawMoney(int money,String passCode)
    {
        if(passCode.equals(this.passCode))
        {
            if(balance-minimum_balance>=money) {
                return "Money : "+money+" has been withdrawn.Remaining Balance is :"+balance;
            }
            else
                return" Insufficient balance.Minimum balance that needs to be supported is "+minimum_balance;
        }
        else
            return "Wrong Password entered";
    }

    public String CheckBalance()
    {
        if(passCode.equals(this.passCode))
        {
            return "The balance is "+balance;
        }
        else
            return "Wrong Password entered";
    }

    public Double CalculateTotalInterest(int time)
    {
        Double simpleInterest=(balance*rateOfInterest*time)/100;
        return simpleInterest;

    }
}
