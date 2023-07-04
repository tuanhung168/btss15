import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("nhap so dau tien");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("nhap so thu 2");
            int num2 = Integer.parseInt(sc.nextLine());
            int total =num1+num2;
            System.out.println(total);
        }catch (Exception e){
            e.getMessage();
        }finally {
            System.out.println("loi");
        }
    }
}