import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);//khai báo đối tượng
        System.out.println("nhập chiều rộng");
        width = scanner.nextFloat();
        System.out.println("nhập chiều dài");
        height= scanner.nextFloat();
        float area = width*height;
        System.out.println("area =" + area);
    }
}
