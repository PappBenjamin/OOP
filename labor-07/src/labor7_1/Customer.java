package labor7_1;


import java.util.ArrayList;

public class Customer {


    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private final int id;
    private static int nextId = 1;

    public Customer(String c1, String c2)
    {
        firstName = c1;
        lastName = c2;
        id = nextId++;
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
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getId(){return this.id;}

    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> accountNumbers = new ArrayList<>();

        for(int i = 0; i < this.accounts.size(); ++i)
        {
            accountNumbers.add(this.accounts.get(i).getAccountNumber());
        }

        return accountNumbers;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("ID: " + this.id + " " + this.firstName + " " + this.lastName + " accounts: ");

        for (int i = 0; i < this.accounts.size(); ++i)
        {
            result.append(accounts.get(i)).append("  ");
        }

        result.append(";");

        return result.toString();
    }

}
