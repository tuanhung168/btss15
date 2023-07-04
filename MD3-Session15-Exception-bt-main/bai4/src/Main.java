import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = chuoiso();

        System.out.println("Danh sách số nguyên: " + integers);
    }
    public static List<Integer> chuoiso(){
        List<Integer> arrays = new ArrayList<>();
        Scanner sa = new Scanner(System.in);
        System.out.println("nhaapj chuoi cos so");
        String number = sa.nextLine();
        String[] fags = number.split("");
        for (String fag: fags
        ) {
            try {
                int array = Integer.parseInt(fag);
                arrays.add(array);
            }catch (NumberFormatException e){
                arrays.add(0);
                System.out.println("nếu là chữ thì bằng 0");
            }
        }
        return arrays;
    }
}