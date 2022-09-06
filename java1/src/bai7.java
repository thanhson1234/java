import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("nhập số cân nặng");
        weight = scanner.nextDouble();

        System.out.println("nhập chiều cao");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.println("kết quả" + bmi + "siêu gầy");
        else if (bmi < 25.0)
            System.out.println("kết quả" + bmi + "bình thường");
        else if (bmi < 30.0)
            System.out.println("kết quả" + bmi + "hơi béo");
        else
            System.out.println("kết quả" + bmi + "béo vãi đái");


    }
}
