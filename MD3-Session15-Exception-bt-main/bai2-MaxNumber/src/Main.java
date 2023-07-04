import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            Integer[] arr = {};
            if (arr.length==0){
                System.out.println("Mảng rong");
                return;
            }
            int max = Collections.max(Arrays.asList(arr));
            System.out.println("so lon nhat " +max);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}