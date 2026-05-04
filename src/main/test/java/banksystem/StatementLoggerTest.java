package banksystem;

import org.junit.jupiter.api.Test;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementLoggerTest {
    @Test
    public void testGetStatementPath() {
        // Paths.get() là hàm chuẩn của Java, tự động chọn dấu / hoặc \ tùy hệ điều hành
        String expected = Paths.get("statements", "user_001.txt").toString();
        
        // Kết quả từ hàm lỗi ở trên
        String actual = StatementLogger.getStatementPath("statements", "user_001.txt");
        
        // So sánh
        assertEquals(expected, actual);
    }
}