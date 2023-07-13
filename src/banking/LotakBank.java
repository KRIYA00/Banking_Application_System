package banking;

public class LotakBank implements RBI_Banking_System
{
    private String accountNo;

    private String password;

    private double rateOfInterest=7.5;
    private double balance;

public LotakBank(String accountNo,String password,double balance)
{
   this.accountNo=accountNo;
   this.balance=balance;
   this.password=password;
}

    @Override
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

    public String WithdrawMoney(int money,String password)
    {
        if(password.equals(this.password))
        {
          if(balance>money)
          {
              balance=balance-money;
              return "Money : "+money+" has been withdrawn.Remaining Balance is :"+balance;
          }
          else
              return "Insufficient balance";
        }
        else
        {
            return "Wrong password entered";
        }
    }


    @Override
    public String CheckBalance()
    {
      if(password.equals(this.password))
      {
          return "The balance is "+balance;
      }
      else
          return "Wrong Password entered";
    }

    @Override
    public  Double CalculateTotalInterest(int time)
    {
        Double simpleInterest=(balance*rateOfInterest*time)/100;
        return simpleInterest;
    }
}
