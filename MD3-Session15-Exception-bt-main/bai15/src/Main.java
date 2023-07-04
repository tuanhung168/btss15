public class Main {
    public static void main(String[] args) {
        try {
            int side1 = -1; // Giá trị cạnh 1
            int side2 = 4; // Giá trị cạnh 2
            int side3 = 5; // Giá trị cạnh 3

            validateTriangle(side1, side2, side3);

            System.out.println("Tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void validateTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh của tam giác phải là số dương.");
        }

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng của hai cạnh phải lớn hơn cạnh còn lại.");
        }
    }
}