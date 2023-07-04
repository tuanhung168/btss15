import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        try {
            System.out.print("Nhập số thứ nhất: ");
            num1 = scanner.nextInt();

            System.out.print("Nhập số thứ hai: ");
            num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                throw new InputMismatchException();
            }

            int gcd = findGreatestCommonDivisor(num1, num2);
            System.out.println("Ước chung lớn nhất của hai số là: " + gcd);
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Hai số đều bằng 0.");
        }

        scanner.close();
    }

    public static int findGreatestCommonDivisor(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }

        if (num2 == 0) {
            return num1;
        }

        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        return num1;
    }
}