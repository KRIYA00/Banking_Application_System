package banking;

public interface RBI_Banking_System
{
     public String AddMoney(int money);
     public String WithdrawMoney(int money,String password);
     public String CheckBalance();
     public Double CalculateTotalInterest(int time);

}
