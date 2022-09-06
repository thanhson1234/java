import java.util.Scanner;

public class bao10 {
    public static void main(String[] args) {
        double vnd=23000;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số USD");
        USD = sc.nextDouble();
         double tiente = vnd* USD;
        System.out.println("tiente = "+tiente);
    }
}
