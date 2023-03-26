public class BasicCustomer implements CustomerAccess, Bankable {

    private Account account;

    public BasicCustomer(Account account) {
        this.account = account;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public int getAccountNumber() {
        return account.getAccountNumber();
    }

    @Override
    public int getCustomerId() {
        return 1111;
    }

    @Override
    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        account.deposit(amount);
    }

}
