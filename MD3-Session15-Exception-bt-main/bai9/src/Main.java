import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        try {
            System.out.print("Nhập số nguyên dương n: ");
            n = scanner.nextInt();

            if (n < 1) {
                throw new InputMismatchException();
            }

            int result = fibonacci(n);
            System.out.println("Số Fibonacci thứ " + n + " là: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Giá trị nhập không phải số nguyên dương. Vui lòng nhập lại.");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fibMinus2 = 0;
        int fibMinus1 = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = fibMinus2 + fibMinus1;
            fibMinus2 = fibMinus1;
            fibMinus1 = fib;
        }

        return fib;
    }
}
