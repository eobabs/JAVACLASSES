package BankingApp;

public class Account {
    private String name;
    private double balance;
    private String pinCode;
    private int number;

    public Account(String name, String pinCode, int number) {
        this.name = name;
        this.pinCode = pinCode;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public double getBalance(String pinCode) {
        validatePin(pinCode);
        return balance;
    }

    public int getAccountNumber() {
        return number;
    }

    public void deposit(double amount) {
        validateAmount(amount);
        this.balance += amount;
    }

    public void withdraw(double amount, String pinCode) {
        validatePin(pinCode);
        validateAmount(amount);
        validateWithdrawal(amount);
        this.balance -= amount;

    }

    private void validateWithdrawal(double amount) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient Funds");
        }
    }

    private void validatePin(String pinCode) {
        if(!this.pinCode.equals(pinCode)) {
            throw new IllegalArgumentException("PinCode does not match");
        }
    }

    private void validateAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be a positive number");
        }
    }
}
