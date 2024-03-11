package oop.labor02.lab_01;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String c1, String c2) {
        firstName = c1;
        lastName = c2;
    }

    public BankAccount setAccount(BankAccount account1) {
        account = account1;
        return account;
    }

    public void closeAccount()
    {
        account = setAccount(null);
    }

    public BankAccount getAccount() {
        return account;
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
        return firstName + " " + lastName + ": " + account + "\n";
    }
}
