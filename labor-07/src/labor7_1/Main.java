package labor7_1;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
       ArrayList<Customer> Bank = new ArrayList<>();

       Bank.add(new Customer("Papp","Benjamin"));
       Bank.add(new Customer("Nago","Daniel"));

        SavingsAccount account = new SavingsAccount(4);
        SavingsAccount account2 = new SavingsAccount(5);

        Bank.getFirst().addAccount(new CheckingAccount(1000));
        Bank.getFirst().addAccount(account);

        Bank.getLast().addAccount(new CheckingAccount(2000));
        Bank.getLast().addAccount(account2);


        System.out.println(Bank.getFirst());
        Bank.getFirst().getaccount("OTP0000000001").deposit(1000);
        account.addInterest();
        System.out.println(Bank.getFirst());





    }
}
