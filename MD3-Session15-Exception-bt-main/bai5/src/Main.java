public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        try {
            int index = binarySearch(arr, target);
            if (index != -1) {
                System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + index + " trong mảng.");
            } else {
                System.out.println("Phần tử " + target + " không được tìm thấy trong mảng.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Mảng không được sắp xếp theo thứ tự tăng dần.");
        }
    }

    public static int binarySearch(int[] arr, int target) throws Exception {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}