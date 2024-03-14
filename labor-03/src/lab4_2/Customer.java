package lab4_2;


import java.util.ArrayList;

public class Customer {


    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String c1, String c2) {
        firstName = c1;
        lastName = c2;
    }

    public void addAccount(BankAccount account1) {
        accounts.add(account1);
    }
    public void closeAccounts(String accountNumber1) {
        for(int i = 0; i < accounts.size();++i)
        {
            if((accounts.contains(accountNumber1)))
            {
                System.out.println("Account found! Waiting...");

                accounts.remove(accounts.get(i));
                System.out.println("Deleted");
            }
        }
    }

    public BankAccount getaccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); ++i)
        {
            if (accounts.get(i).getAccountNumber().equals(accountNumber))
            {
                return accounts.get(i);
            }
        }

        System.out.println("Nem letezo szamlaszam");
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder(this.firstName + " " + this.lastName + " accounts: ");

        for (int i = 0; i < accounts.size(); ++i)
        {
            result.append(accounts.get(i)).append("  ");
        }

        result.append(";");

        return result.toString();
    }

}
