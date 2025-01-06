package BankingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMApp {
    private static List<Bank> bankList = new ArrayList<Bank>();

    public static void main(String[] args) {
        bankList.add(new Bank("Bank Name"));
        bankList.add(new Bank("Second Bank Name"));
        goToMenu();
    }

    public static void goToMenu() {
        String mainMenu = """
                Welcome to the Bank Management System!
                
                Press 1 to Add a Bank Account
                Press 2 to Deposit into a Bank Account
                Press 3 to Withdraw from a Bank Account
                Press 4 to Transfer Money (Same Bank)
                Press 5 to Transfer Money to Another Bank
                Press 6 to Check Account Balance
                Press 7 to Exit
                
                """;
        display(mainMenu);
        selectOption(input("Enter option: ").charAt(0));
    }

    private static void selectOption(char userInput) {
        switch (userInput) {
            case '1': createAccount(); break;
            case '2': deposit(); break;
            case '3': withdraw(); break;
            case '4': transferToSameBank(); break;
            case '5': transferToOtherBanks(); break;
            case '6': checkBalance(); break;
            case '7': exitATMApplication(); break;
            default: display("Invalid input. Please try again."); goToMenu(); break;
        }
    }

    private static void createAccount() {
        String bankName = input("Enter Bank Name: ");
        String accountHolderName = input("Enter Account Holder Name: ");
        String pinCode = input("Enter pin code for the account: ");
        String accountNumber = input("Enter Account Number: ");
        Bank selectedBank = findBank(bankName);
        Account newAccount = selectedBank.createAccount(accountHolderName, pinCode, accountNumber);

        display(String.format("Account created successfully with Account Number: %s", newAccount.getAccountNumber()));
        goToMenu();
    }

    private static void deposit() {
        String bankName = input("Enter Bank Name: ");
        String accountNumber = input("Enter Account Number: ");
        double amount = collectDoubleInput("Enter amount to deposit: ");

        Bank selectedBank = findBank(bankName);
        selectedBank.deposit(accountNumber, amount);

        display(String.format("Deposited %.2f to Account %s", amount, accountNumber));
        goToMenu();
    }

    private static void withdraw() {
        String bankName = input("Enter Bank Name: ");
        String accountNumber = input("Enter Account Number: ");
        double amount = collectDoubleInput("Enter amount to withdraw: ");
        String pinCode = input("Enter your pin code: ");

        Bank selectedBank = findBank(bankName);
        Account account = selectedBank.getAccountByNumber(accountNumber);

        if (account != null && account.getPinCode().equals(pinCode)) {
            selectedBank.withdraw(accountNumber, amount, pinCode);
            display(String.format("Withdrawn %.2f from Account %s", amount, accountNumber));
        } else {
            display("Invalid Account or Pin Code.");
        }
        goToMenu();
    }

    private static void transferToSameBank() {
        String bankName = input("Enter Bank Name: ");
        String fromAccountNumber = input("Enter Sender Account Number: ");
        String toAccountNumber = input("Enter Receiver Account Number: ");
        double amount = collectDoubleInput("Enter amount to transfer: ");
        String pinCode = input("Enter your pin code: ");

        Bank selectedBank = findBank(bankName);
        Account fromAccount = selectedBank.getAccountByNumber(fromAccountNumber);
        Account toAccount = selectedBank.getAccountByNumber(toAccountNumber);

        if (fromAccount != null && toAccount != null && fromAccount.getPinCode().equals(pinCode)) {
            selectedBank.transfer(fromAccountNumber, toAccountNumber, amount, pinCode);
            display(String.format("Transferred %.2f from Account %s to %s", amount, fromAccountNumber, toAccountNumber));
        } else {
            display("Invalid Account or Pin Code.");
        }
        goToMenu();
    }

    private static void transferToOtherBanks() {
        String fromBankName = input("Enter Sender's Bank Name: ");
        String fromAccountNumber = input("Enter Sender Account Number: ");
        String toBankName = input("Enter Receiver's Bank Name: ");
        String toAccountNumber = input("Enter Receiver Account Number: ");
        double amount = collectDoubleInput("Enter amount to transfer: ");
        String pinCode = input("Enter your pin code: ");

        Bank fromBank = findBank(fromBankName);
        Bank toBank = findBank(toBankName);
        Account fromAccount = fromBank.getAccountByNumber(fromAccountNumber);
        Account toAccount = toBank.getAccountByNumber(toAccountNumber);

        if (fromAccount != null && toAccount != null && fromAccount.getPinCode().equals(pinCode)) {
            fromBank.transfer(fromAccountNumber, toAccountNumber, amount, pinCode);
            display(String.format("Transferred %.2f from Account %s (Bank: %s) to Account %s (Bank: %s)",
                    amount, fromAccountNumber, fromBankName, toAccountNumber, toBankName));
        } else {
            display("Invalid Account or Pin Code.");
        }
        goToMenu();
    }

    private static void checkBalance() {
        String bankName = input("Enter Bank Name: ");
        String accountNumber = input("Enter Account Number: ");
        String pinCode = input("Enter pin code: ");

        Bank selectedBank = findBank(bankName);
        Account account = selectedBank.getAccountByNumber(accountNumber);

        if (account != null && account.getPinCode().equals(pinCode)) {
            display(String.format("Balance of Account %s: %.2f", accountNumber, account.getBalance(pinCode)));
        } else {
            display("Invalid Account or Pin Code.");
        }
        goToMenu();
    }

    private static void exitATMApplication() {
        display("Thank you. Exiting the Application.");
        System.exit(0);
    }

    private static Bank findBank(String bankName) {
        for (Bank bank : bankList) {
            if (bank.getBankName().equals(bankName)) {
                return bank;
            }
        }
        display("Bank not found. Please try again.");
        return null;
    }

    private static double collectDoubleInput(String prompt) {
        try {
            return Double.parseDouble(input(prompt));
        } catch (NumberFormatException error) {
            display("Invalid input. Please enter a valid amount.");
            return collectDoubleInput(prompt);
        }
    }

    private static String input(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void display(String message) {
        System.out.println(message);
    }
}
