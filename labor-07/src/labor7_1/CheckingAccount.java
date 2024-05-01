package labor7_1;

public class CheckingAccount extends BankAccount
{
    private double overDraftLimit;
    public CheckingAccount(double overDraftLimit)
    {
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return this.overDraftLimit;
    }
    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    public boolean withdraw(double amount) {
        if (amount > balance + this.overDraftLimit)
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
    @Override
    public String toString() {
        return super.toString();
    }
}
