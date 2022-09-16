package sieubo;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Manage manage = new Manage();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("------------MENU---------------");
        System.out.println("1.hiển thị");
        System.out.println("2.thêm");
        System.out.println("3.sửa");
        System.out.println("4.xoa");
        System.out.println("5.exit");
        while (true){
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    manage.thongtin();
                    break;
            }
        }
    }

}
