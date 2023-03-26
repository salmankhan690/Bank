public class Account implements Bankable {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("insufficient funds");
        }

    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public double getBalance() {

        return balance;
    }

    public int getAccountNumber() {
        return 0;
    }

    public int getCustomerId() {
        return 0;
    }

}