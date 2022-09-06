import java.util.Scanner;

public class tinhTienVayLai {
    public static void main(String[] args) {
        double monney = 1.0;
        int month = 1;
        double ratio = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tien");
        monney = input.nextDouble();

        System.out.println("nhập tháng");
        month = input.nextInt();

        System.out.println("nhập tỉ lệ");
        ratio = input.nextDouble();
        double totalLaixuat=0;
        for (int i = 0; i < month; i++) {
            totalLaixuat += monney * (ratio / 100) / 12 * month;
        }
        System.out.println("tổng lãi xuất "+ totalLaixuat);
    }
}
