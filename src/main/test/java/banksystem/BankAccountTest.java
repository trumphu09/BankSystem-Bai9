package banksystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    public void testInitAccountSuccess() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testInitAccountFail() {
        // Kịch bản test cố tình khởi tạo số dư âm xem có báo lỗi không
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-50);
        });
    }

    @Test
    public void testDepositSuccess() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testDepositFail() {
        BankAccount account = new BankAccount(100);
        // Kịch bản test cố tình nạp số tiền âm
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-20);
        });
    }
}