package BankingApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAccount {
    Account account;

    @BeforeEach
    public void setUp() {
        account = new Account ("Jesse", "pinCode", "001");
    }

    @Test
    public void test_AccountCanDeposit5kTwice_BalanceIs10k() {
        assertEquals(0.0, account.getBalance("pinCode"));
        account.deposit(5000.0);
        account.deposit(5000.0);
        assertEquals(10000.0, account.getBalance("pinCode"));
    }

    @Test
    public void test_depositNegativeAmountInto_ThrowsException_balanceIsZeroBeforeAndAfterDeposit(){
        assertEquals(0.0, account.getBalance("pinCode"));
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-5000.0));
        assertEquals(0.0, account.getBalance("pinCode"));
    }

    @Test
    public void test_Deposit5k_getBalanceThrowsExceptionWithWrongPinCode() {
        assertEquals(0.0, account.getBalance("pinCode"));
        account.deposit(5000.0);
        assertThrows(IllegalArgumentException.class, () -> account.getBalance("5000.0"));
    }

    @Test
    public void test_withdraw5k_after10kDeposit(){
        account.deposit(10000.0);
        assertEquals(10000.0, account.getBalance("pinCode"));
        account.withdraw(5000.0,"pinCode");
        assertEquals(5000.0, account.getBalance("pinCode"));
    }

    @Test
    public void test_withdrawWithWrongPin_throwsException_after10kDeposit(){
        account.deposit(10000.0);
        assertEquals(10000.0, account.getBalance("pinCode"));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(5000.0,"Code"));
        assertEquals(10000.0, account.getBalance("pinCode"));
    }
}
