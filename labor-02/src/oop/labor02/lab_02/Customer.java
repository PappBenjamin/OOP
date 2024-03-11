package oop.labor02.lab_02;


import oop.labor02.lab_01.BankAccount;


public class Customer {
    public static final int MAX_ACCOUNTS = 10;


    private String firstName;
    private String lastName;
    private int numAccounts;
    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];

    public Customer(String c1, String c2) {
        firstName = c1;
        lastName = c2;
    }

    public void addAccount(BankAccount account1) {
        if (numAccounts < MAX_ACCOUNTS) {
            this.accounts[numAccounts] = account1;
            numAccounts++;
        }
    }

    public void closeAccounts(String accountNumber1)
    {
        for(int i = 0; i < numAccounts;++i)
        {
            if((accounts[i].getAccountNumber()).equals(accountNumber1))
            {
                System.out.println("Account found! Waiting...");
                accounts[i] = null;

                for(int j = i; j < numAccounts - 1; ++i)
                {
                    accounts[j] = accounts[j + 1];
                    --numAccounts;
                }

                System.out.println("Deleted");
            }
        }
    }

    public BankAccount getaccount(String accountNumber) {
        for (int i = 0; i < numAccounts; ++i) {
            if (this.accounts[i].getAccountNumber().equals(accountNumber)) {
                return this.accounts[i];
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


    public int getNumAccounts() {
        return numAccounts;
    }

    @Override
    public String toString() {
        String result = this.firstName + " " + this.lastName + " accounts:\n";

        for (int i = 0; i < this.numAccounts; ++i) {
            result += this.accounts[i] + "\n";
        }
        return result;
    }

}
