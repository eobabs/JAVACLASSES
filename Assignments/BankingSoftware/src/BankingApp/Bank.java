package BankingApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = accounts = new ArrayList<>();
    private int accountCount = 0;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public Account createAccount(String name, String pinCode, String number) {
        Account account = new Account(name, pinCode, number);
        accounts.add(account);
        accountCount++;
        return account;
    }

    public int getAccountCount() {
        return accountCount;
    }

    public Account getAccountByNumber(String number) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(number)) {
                return account;
            }
        }
        return null;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = getAccountByNumber(accountNumber);
        validateAccount(account);
        account.deposit(amount);

    }

    public void withdraw(String accountNumber, double amount, String pinCode) {
        Account account = getAccountByNumber(accountNumber);
        validateAccount(account);
        account.withdraw(amount, pinCode);

    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount, String pinCode) {
        Account fromAccount = getAccountByNumber(fromAccountNumber);
        Account toAccount = getAccountByNumber(toAccountNumber);

        validateAccount(fromAccount);
        validateAccount(toAccount);
        fromAccount.withdraw(amount, pinCode);
        toAccount.deposit(amount);


    }

    private void validateAccount(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
    }
}
