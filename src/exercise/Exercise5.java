package exercise;

public class Exercise5 {
    public static void main(String[] args) {

        System.out.println(String.format("%60s", "Student List"));
        printSeperator();
        printRow("ID", "Name", "Age", "Phone", "Mail");
        printRow("1", "Minh Khang", "22", "0903581777", "khangnguyen@gmail.com");
        printRow("2", "Minh Khang", "22", "0903581777", "khangnguyen@gmail.com");
        printRow("3", "Thi Minh Khang", "22", "0903581777", "khangnguyen@gmail.com");
        printRow("4", "Tran Minh Khang", "22", "0903581777", "khangnguyen@gmail.com");
        printRow("5", "Nguyen Thi Minh Khang", "22", "0903581777", "khangnguyen@gmail.com");
    }

    public static void printSeperator() {
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    public static void printRow(String id, String name, String age, String phone, String mail) {
        System.out.println("| " + String.format("%-6s", id) + " | " +
                String.format("%-30s", name) + " | " +
                String.format("%-6s", age) + " | " +
                String.format("%-20s", phone) + " | " +
                String.format("%-30s", mail) + " |");
        printSeperator();
    }
}
