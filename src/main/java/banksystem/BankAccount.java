package banksystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    // Khai báo Logger
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
    
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            // Dùng ERROR cho ngoại lệ, dấu {} dùng để chèn tham số (Parameterized Logging)
            logger.error("Khong the khoi tao tai khoan vi so du am: {}", initialBalance);
            throw new IllegalArgumentException("So du khong duoc am");
        }
        this.balance = initialBalance;
        // Dùng INFO cho mốc quan trọng
        logger.info("Khoi tao tai khoan thanh cong. So du: {}", initialBalance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            logger.error("Giao dich that bai. So tien nap khong hop le: {}", amount);
            throw new IllegalArgumentException("So tien nap phai lon hon 0");
        }
        this.balance += amount;
        logger.info("Nap thanh cong: {}. So du hien tai: {}", amount, this.balance);
    }

    public double getBalance() {
        return balance;
    }
}