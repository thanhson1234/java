package oop2;

import java.util.Scanner;

public class phuongThuc1 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("nhập số a,b,c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        khoiTao kq = new khoiTao(a, b, c);
        if (kq.delta () < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (kq.delta () == 0) {
            System.out.println("Phương trình có nghiệm duy nhất =" + kq.getRoot1());
        } else {
            System.out.println("phương trình có 2 nghiệm");
            System.out.println("dental =" + kq.delta ());
            System.out.println("nghiệm 1 =" + kq.getRoot1());
            System.out.println("nghiệm 2 =" + kq.getRoot2());
        }
    }
}
