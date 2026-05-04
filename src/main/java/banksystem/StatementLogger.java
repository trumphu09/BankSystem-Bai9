package banksystem;

import java.nio.file.Paths;

public class StatementLogger {
    // ĐÃ SỬA LỖI: Dùng Paths.get() để Java tự chọn đúng loại dấu gạch chéo
    public static String getStatementPath(String folder, String fileName) {
        return Paths.get(folder, fileName).toString(); 
    }
}