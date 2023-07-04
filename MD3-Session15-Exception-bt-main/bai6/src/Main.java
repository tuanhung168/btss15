import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số bị chia: ");
        int dividend = scanner.nextInt();

        System.out.print("Nhập số chia: ");
        int divisor = scanner.nextInt();

        try {
            int quotient = divide(dividend, divisor);
            System.out.println("Kết quả phép chia: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Số chia không thể là 0.");
        }
        scanner.close();
    }
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}