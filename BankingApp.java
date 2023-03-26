public class BankingApp {
    public static void main(String[] arg) {
        SavingsAccount savingsAccount = new SavingsAccount(5000); // create a savings account with an initial balance of
                                                                  // 5000
        CheckingAccount checkingAccount = new CheckingAccount(1000); // create a checking account with an initial
                                                                     // balance of 1000

        BasicCustomer bCustomer = new BasicCustomer(savingsAccount); // create a BasicCustomer object that references
                                                                     // the savings account
        PremiumCustomer pCustomer = new PremiumCustomer(checkingAccount); // create a PremiumCustomer object that
                                                                          // references the checking account

        // test the getBalance(), getAccountNumber(), and getCustomerId() methods of the
        // BasicCustomer object
        System.out.println("Basic Customer Account Number: " + bCustomer.getAccountNumber());
        System.out.println("Basic Customer ID: " + bCustomer.getCustomerId());
        System.out.println("Basic Customer Balance: $" + bCustomer.getBalance());

        // test the getBalance(), getAccountNumber(), and getCustomerId() methods of the
        // PremiumCustomer object
        System.out.println("Premium Customer Account Number: " + pCustomer.getAccountNumber());
        System.out.println("Premium Customer ID: " + pCustomer.getCustomerId());
        System.out.println("Premium Customer Balance: $" + pCustomer.getBalance());

        // test the deposit() and withdraw() methods of the BasicCustomer object
        bCustomer.deposit(1000);
        bCustomer.withdraw(500);
        System.out.println("Basic Customer Balance: $" + bCustomer.getBalance()); // should print "Basic Customer
                                                                                  // Balance: $5500"

        // test the deposit() and withdraw() methods of the PremiumCustomer object
        pCustomer.deposit(2000);
        pCustomer.withdraw(1500);
        System.out.println("Premium Customer Balance: $" + pCustomer.getBalance()); // should print "Premium
                                                                                    // Customer Balance: $1500"
    }

}