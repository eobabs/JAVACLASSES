package codingChallenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    Bank gtBank = new Bank();
    Account account1 = new Account("001", "Jesse", "1234");
    Account account2 = new Account("002", "Williams", "5678");



    @BeforeEach
    public void setupBank() {
        gtBank.createAccount(account1);
        gtBank.createAccount(account2);
    }

    @Test
    public void testAddAccount() {
        assertEquals(2, gtBank.getAccountCount());
    }

    @Test
    public void testDeposit() {
        gtBank.deposit("001", 5000);
        assertEquals(5000, account1.getBalance("1234"));
    }

    @Test
    public void testWithdraw() {
        gtBank.deposit("001", 5000);
        gtBank.withdraw("001", 2000, "1234");
        assertEquals(3000, account1.getBalance("1234"));
    }

    @Test
    public void testWithdrawWithIncorrectPin() {
        gtBank.deposit("001", 5000);
        assertThrows(IllegalArgumentException.class, () -> {
            gtBank.withdraw("001", 2000, "wrongPin");
        });
    }

    @Test
    public void testTransfer() {
        gtBank.deposit("001", 5000);
        gtBank.transfer("001", "002", 2000, "1234");
        assertEquals(3000, account1.getBalance("1234"));
        assertEquals(2000, account2.getBalance("5678"));
    }

    @Test
    public void testTransferWithInsufficientFunds() {
        gtBank.deposit("001", 2000);
        assertThrows(IllegalArgumentException.class, () -> {
            gtBank.transfer("001", "002", 5000, "1234");
        });
    }

    @Test
    public void testAccountNotFound() {
        assertThrows(IllegalArgumentException.class, () -> {
            gtBank.deposit("999", 1000);
        });
    }
}
