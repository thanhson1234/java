package baitap006;

import java.util.Scanner;

public class QuanLySo {
    static Scanner sc = new Scanner(System.in);
    static int[] numbers = {};

    public static void main(String[] args) {
        while (true) {
            System.out.println(" Quản lý số");
            System.out.println(" 1.hiển thị");
            System.out.println(" 2.thêm");
            System.out.println(" 3.sửa");
            System.out.println(" 4. xoa");
            System.out.println(" 5. exit");
            int x = Integer.parseInt(sc.nextLine());
            System.out.println("bạn đã chọn " + x);
            switch (x) {
                case 1:
                    them();
                    break;
                case 2:
                    sua();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }

        }
    }
    public static void show() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + "");
        }
    }

    public static void them() {
        System.out.println("nhập số muốn thêm");
        int so = Integer.parseInt(sc.nextLine());
        int[] newArr = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newArr[i] = numbers[i];
        }
        newArr[newArr.length - 1] = so;  // so ở phần nhập vào
        numbers = newArr;   // NÓ LÀ GÁN ĐẤY

    }

    public static void sua() {
        System.out.println("vị trí muoons sửa");
        int index = Integer.parseInt(sc.nextLine());
            if (index >= 0 && index < numbers.length) {
                System.out.println("nhập số muốn sửa");
                int so = Integer.parseInt(sc.nextLine());
                numbers[index] = so;
            }else {
                System.out.println("lỗi rồi");
            }
        }
    public static void xoa(){
        System.out.println("vị trí muốn xóa");
        int index = Integer.parseInt(sc.nextLine());
        int [] a= new int[numbers.length-1];
        for(int i = 0; i<numbers.length;i++){
            if(i<index) {
                a[i] = numbers[i];

            }else {
                a[i]= numbers[i+1];
            }
            a[i]= numbers[i];
        }
    }
}
