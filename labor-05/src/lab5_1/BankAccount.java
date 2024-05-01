package lab5_1;

public class BankAccount {

    public static final String PREFIX = "OTP";

    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private final String accountNumber;
    private static int numaccounts;
    private double balance;


    public BankAccount(double Balance) {
        ++numaccounts;
        accountNumber = createAccountNumber();
        balance = Balance;
        
    }


    private static String createAccountNumber()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX);

        for(int i = 0; i < ACCOUNT_NUMBER_LENGTH - String.valueOf(numaccounts).length(); ++i)
        {
            sb.append(0);
        }
        sb.append(numaccounts);

        return sb.toString();
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > balance) {
            System.out.println("Error!");
        } else {
            balance -= amount;
        }
    }

    public void withdraw(double amount) {
        balance += amount;
    }


    @Override
    public String toString() {
        return accountNumber + " " + balance;
    }
}

