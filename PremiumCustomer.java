public class PremiumCustomer implements CustomerAccess, Bankable {

    private Account account;

    public PremiumCustomer(Account account) {
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
        return account.getCustomerId();
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
