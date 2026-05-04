package banksystem;

public class StatementLogger {
    // CỐ TÌNH LỖI: Dùng cứng dấu gạch chéo ngược "\" của Windows
    public static String getStatementPath(String folder, String fileName) {
        return folder + "\\" + fileName; 
    }
}