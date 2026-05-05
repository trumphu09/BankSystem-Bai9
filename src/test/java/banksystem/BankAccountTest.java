package banksystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    public void testLoggingEvents() {
        // 1. Tạo tài khoản thành công (Sinh ra log INFO)
        BankAccount account = new BankAccount(500);
        
        // 2. Nạp tiền thành công (Sinh ra log INFO)
        account.deposit(200);
        
        // 3. Cố tình nạp tiền sai để sinh ra log ERROR
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50);
        });
    }
}