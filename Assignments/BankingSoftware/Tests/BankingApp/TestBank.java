package BankingApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBank {
    Bank gtBank;

    @BeforeEach
    public void setupBank() {
        gtBank = new Bank("Guaranty Trust Bank");
        gtBank.createAccount("Jesse", "1234", "001");
        gtBank.createAccount("Williams", "5678", "002");
}

    @Test
    public void testAddAccount() {
        assertEquals(2, gtBank.getAccountCount());
    }

    @Test
    public void testDeposit() {
        gtBank.deposit("001", 5000);
        assertEquals(5000, gtBank.getAccountByNumber("001").getBalance("1234"));
    }

    @Test
    public void testWithdraw() {
        gtBank.deposit("001", 5000);
        gtBank.withdraw("001", 2000, "1234");
        assertEquals(3000, gtBank.getAccountByNumber("001").getBalance("1234"));
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
        assertEquals(3000, gtBank.getAccountByNumber("001").getBalance("1234"));
        assertEquals(2000, gtBank.getAccountByNumber("002").getBalance("5678"));
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
