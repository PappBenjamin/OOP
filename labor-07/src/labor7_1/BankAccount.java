package labor7_1;

public class BankAccount {

    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numaccounts;
    protected final String accountNumber;
    protected double balance;


    protected BankAccount() {
        numaccounts++;
        accountNumber = createAccountNumber();

        
    }
    private static String createAccountNumber(){
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

    public boolean withdraw(double amount) {
        if (amount > balance)
        {
            System.out.println("Error!");
            return false;
        }
        else
        {
            balance -= amount;
            return true;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }


    @Override
    public String toString() {
        return accountNumber + " " + balance;
    }
}

