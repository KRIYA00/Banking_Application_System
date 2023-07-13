package banking;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Which Bank,do you want to open an account with?");
        System.out.println("Print 1 to open an account in LotakBank " +
                           "and 2 to open an account in SBIBank ");

        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        RBI_Banking_System bankAccount;

        System.out.println("Enter password and Initial Deposit");
        String password=sc.next();
        Integer initialBalance=sc.nextInt();

        //accnt no
        //Concept of UUID:Helps to generate a random around a 16 digit number;

        double account=Math.abs(Math.random()*Math.pow(10,9));

        if(option==1)
        {

            bankAccount = new LotakBank(String.valueOf(account),password,initialBalance);
        }
        else
        {
            bankAccount = new SBIBank(String.valueOf(account),password,initialBalance);

        }
        String res=bankAccount.WithdrawMoney(700000,password);
        System.out.println(res);
        res=bankAccount.WithdrawMoney(70000,password);
        System.out.println(res);

        res=bankAccount.AddMoney(70000);
        System.out.println(res);
        System.out.println(bankAccount.CheckBalance());
        System.out.println(bankAccount.CalculateTotalInterest(3));


    }
}