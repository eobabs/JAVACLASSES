import java.util.Scanner;

public class BankeBank {
    public static void main(String[] args) {
        Scanner bank = new Scanner(System.in);
        

	System.out.println("How many customers do you have?");
        int numberOfAccountHolders = bank.nextInt();

        String[] firstNames = new String[numberOfAccountHolders];
        String[] lastNames = new String[numberOfAccountHolders];
        String[] pins = new String[numberOfAccountHolders];
        double[] balances = new double[numberOfAccountHolders];
        boolean[] isActive = new boolean[numberOfAccountHolders];

        int accountCount = 0;

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Close Account");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Transfer Money");
            System.out.println("7. Change PIN");
            System.out.println("8. Exit");
            System.out.print("Select an option: ");
            int choice = bank.nextInt();

            switch (choice) {
                case 1:
                    if (accountCount < numberOfAccountHolders) {
                        System.out.print("Enter First Name: ");
                        firstNames[accountCount] = bank.next();
                        System.out.print("Enter Last Name: ");
                        lastNames[accountCount] = bank.next();
                        System.out.print("Set a PIN: ");
                        pins[accountCount] = bank.next();
                        balances[accountCount] = 0.0;
                        isActive[accountCount] = true;
                        System.out.println("Account created. Your Account ID is " + (accountCount + 1));
                        accountCount++;
                    } else {
                        System.out.println("Maximum accounts reached.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    int depositAccountId = bank.nextInt() - 1;
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = bank.nextDouble();
                    if (depositAccountId >= 0 && depositAccountId < accountCount) {
                        if (isActive[depositAccountId]) {
                            balances[depositAccountId] += depositAmount;
                            System.out.println("Deposited " + depositAmount + ". New balance: " + balances[depositAccountId]);
                        } else {
                            System.out.println("Account is closed.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account ID: ");
                    int closeAccountId = bank.nextInt() - 1;
                    System.out.print("Enter PIN: ");
                    String closePin = bank.next();
                    if (closeAccountId >= 0 && closeAccountId < accountCount) {
                        if (pins[closeAccountId].equals(closePin) && isActive[closeAccountId]) {
                            isActive[closeAccountId] = false;
                            System.out.println("Account closed.");
                        } else {
                            System.out.println("Invalid PIN or account already closed.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account ID: ");
                    int withdrawAccountId = bank.nextInt() - 1;
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = bank.nextDouble();
                    System.out.print("Enter PIN: ");
                    String withdrawPin = bank.next();
                    if (withdrawAccountId >= 0 && withdrawAccountId < accountCount) {
                        if (isActive[withdrawAccountId] && pins[withdrawAccountId].equals(withdrawPin)) {
                            if (withdrawAmount <= balances[withdrawAccountId]) {
                                balances[withdrawAccountId] -= withdrawAmount;
                                System.out.println("Withdrew " + withdrawAmount + ". New balance: " + balances[withdrawAccountId]);
                            } else {
                                System.out.println("Insufficient funds.");
                            }
                        } else {
                            System.out.println("Invalid PIN or account is closed.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account ID: ");
                    int balanceAccountId = bank.nextInt() - 1;
                    System.out.print("Enter PIN: ");
                    String balancePin = bank.next();
                    if (balanceAccountId >= 0 && balanceAccountId < accountCount) {
                        if (isActive[balanceAccountId] && pins[balanceAccountId].equals(balancePin)) {
                            System.out.println("Account balance: " + balances[balanceAccountId]);
                        } else {
                            System.out.println("Invalid PIN or account is closed.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Your Account ID: ");
                    int fromAccountId = bank.nextInt() - 1;
                    System.out.print("Enter Recipient Account ID: ");
                    int toAccountId = bank.nextInt() - 1;
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = bank.nextDouble();
                    System.out.print("Enter Your PIN: ");
                    String transferPin = bank.next();
                    
                    if (fromAccountId >= 0 && fromAccountId < accountCount && toAccountId >= 0 && toAccountId < accountCount) {
                        if (isActive[fromAccountId] && isActive[toAccountId] && pins[fromAccountId].equals(transferPin)) {
                            if (transferAmount <= balances[fromAccountId]) {
                                balances[fromAccountId] -= transferAmount;
                                balances[toAccountId] += transferAmount;
                                System.out.println("Transferred " + transferAmount + " from Account ID " + (fromAccountId + 1) + " to Account ID " + (toAccountId + 1));
                            } else {
                                System.out.println("Insufficient funds.");
                            }
                        } else {
                            System.out.println("Invalid PIN or one of the accounts is closed.");
                        }
                    } else {
                        System.out.println("One or both accounts not created or closed");
                    }
                    break;

                case 7:
                    System.out.print("Enter Account ID: ");
                    int changePinAccountId = bank.nextInt() - 1;
                    System.out.print("Enter old PIN: ");
                    String oldPin = bank.next();
                    System.out.print("Enter new PIN: ");
                    String newPin = bank.next();
                    if (changePinAccountId >= 0 && changePinAccountId < accountCount) {
                        if (isActive[changePinAccountId] && pins[changePinAccountId].equals(oldPin)) {
                            pins[changePinAccountId] = newPin;
                            System.out.println("PIN changed successfully.");
                        } else {
                            System.out.println("Invalid PIN or account is closed.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 8:
                    System.out.println("Exiting the ATM. Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
