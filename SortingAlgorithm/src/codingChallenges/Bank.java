package codingChallenges;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = accounts = new ArrayList<>();
    private int accountCount = 0;

    public void createAccount(Account account) {
        accounts.add(account);
        accountCount++;
    }

    public int getAccountCount() {
        return accountCount;
    }

    public Account getAccountByNumber(String number) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                return account;
            }
        }
        return null;
    }

    public void deposit(String accountNumber, int amount) {
        Account account = getAccountByNumber(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            throw new IllegalArgumentException("Account not found");
        }
    }

    public void withdraw(String accountNumber, int amount, String pinCode) {
        Account account = getAccountByNumber(accountNumber);
        if (account != null) {
            account.withdraw(amount, pinCode);
        } else {
            throw new IllegalArgumentException("Account not found");
        }
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, int amount, String pinCode) {
        Account fromAccount = getAccountByNumber(fromAccountNumber);
        Account toAccount = getAccountByNumber(toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            fromAccount.withdraw(amount, pinCode);
            toAccount.deposit(amount);
        } else {
            throw new IllegalArgumentException("Account(s) not found");
        }

    }
}
