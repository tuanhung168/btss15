import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        try {
            String reversedString = reverseString(input);
            System.out.println("Chuỗi đảo ngược: " + reversedString);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: Chuỗi không hợp lệ.");
        }

        scanner.close();
    }

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}