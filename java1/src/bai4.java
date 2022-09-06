import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("nhập số");
        System.out.println(" cho hàm 'a * x + b = c', ấn enter để ra kết quả");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a :");
        double a = scanner.nextDouble();

        System.out.println("b :");
        double b = scanner.nextDouble();

        System.out.println("c :");
        double c = scanner.nextDouble();
        if (a != 0){
            double answer = (c - b) / a;
            System.out.println(" nghiệm duy nhất = " + answer);
        }else {
            if(b ==c ){
                System.out.println("phương trình có vô số nghiệm  ");
            }else {
                System.out.println(" không có nghiệm");
            }
        }
    }
}
