package labor7_1;

public class SavingsAccount extends BankAccount
{
    private double interestRate;
    public SavingsAccount(double interestRate) {
       this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }
    public void addInterest()
    {
        balance += balance * interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + " Interest rate: " + interestRate + " Interest: " + balance;
    }
}
