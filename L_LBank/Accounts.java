/*
The L&L(L_L) bank can handle up to 30 customers who have savings (חסכונות) accounts.
Design and implement a program that manages the accounts. Keep track of key information and allow 
each customer to make deposits and withdrawals. Produce appropriate error messages for invalid transactions.
Also provide a method to add 3 percent interest (ריבית) to all accounts 
whenever the method is invoked.
*/

package L_LBank;

/**
 * Represents a bank account.
 */
public class Accounts {
    private String accountNumber;
    private double balance;

    /**
     * Constructs a bank account with the specified account number and initial balance.
     * @param accountNumber The account number.
     * @param balance The initial balance.
     */
    public Accounts(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Gets the account number.
     * @return The account number.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets the current balance.
     * @return The balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits money into the account.
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    /**
     * Withdraws money from the account.
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient funds.");
        }
    }

    /**
     * Adds interest to the account balance.
     */
    public void addInterest() {
        double interest = balance * 0.03;
        balance += interest;
        System.out.println("Interest added. New balance: " + balance);
    }
}
