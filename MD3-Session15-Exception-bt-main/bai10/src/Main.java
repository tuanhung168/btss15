import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;

        try {
            System.out.print("Nhập bán kính hình tròn: ");
            radius = scanner.nextDouble();

            if (radius < 0) {
                throw new InputMismatchException();
            }

            double area = calculateCircleArea(radius);
            System.out.println("Diện tích hình tròn là: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Giá trị nhập không hợp lệ. Vui lòng nhập lại.");
        }

        scanner.close();
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}