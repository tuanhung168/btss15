import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        while (true) {
            try {
                System.out.print("Nhập số nguyên thứ nhất: ");
                number1 = scanner.nextInt();

                System.out.print("Nhập số nguyên thứ hai: ");
                number2 = scanner.nextInt();

                break; // Thoát khỏi vòng lặp nếu nhập đúng số nguyên
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Giá trị nhập không phải số nguyên. Vui lòng nhập lại.");
                scanner.nextLine(); // Đọc và loại bỏ giá trị không hợp lệ trong bộ nhớ đệm
            }
        }

        int max = findMax(number1, number2);
        System.out.println("Số lớn nhất là: " + max);

        scanner.close();
    }

    public static int findMax(int number1, int number2) {
        return Math.max(number1, number2);
    }
}