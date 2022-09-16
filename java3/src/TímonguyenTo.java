import javax.swing.*;
import java.util.Scanner;

public class TímonguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai cua mang ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap phan tu tai vi tri " + i);
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            boolean check = true;
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0)
                    check = false;
            }
            if (check) {
                System.out.println("là số nguyên tố" + a[i]);
            } else {
                System.out.println("không phải số nguyên tố" + a[i]);
            }

        }
    }
}
