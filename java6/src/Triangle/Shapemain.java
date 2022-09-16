package Triangle;

import java.util.Scanner;

public class Shapemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle.setColer(sc.nextLine());
        System.out.println("chu vi tam giac "+triangle.getPerimeter() + triangle.coler);
    }



}
