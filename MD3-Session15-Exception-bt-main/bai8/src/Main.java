import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        try {
            System.out.print("Nhập một số nguyên dương: ");
            number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " là số nguyên tố.");
            } else {
                System.out.println(number + " không là số nguyên tố.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Giá trị nhập không phải số nguyên. Vui lòng nhập lại.");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}