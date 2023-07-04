
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            double average = calculateAverage(array);
            System.out.println("Giá trị trung bình của mảng là: " + average);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: Mảng không có phần tử.");
        }
    }

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}