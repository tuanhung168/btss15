import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month, year;

        try {
            System.out.print("Nhập ngày: ");
            day = scanner.nextInt();

            System.out.print("Nhập tháng: ");
            month = scanner.nextInt();

            System.out.print("Nhập năm: ");
            year = scanner.nextInt();

            if (isValidDate(day, month, year)) {
                System.out.println("Ngày tháng năm hợp lệ.");
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Ngày tháng năm không hợp lệ.");
        }

        scanner.close();
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (year <= 0) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }

        return true;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth;

        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
        }

        return daysInMonth;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}