package oop5;

import java.util.Arrays;
import java.util.Scanner;

public class quanLyMang {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println(" 1. hiển thị mảng");
            System.out.println("2. thêm phần tử");
            System.out.println("3. sửa phần tử");
            System.out.println("4. exit");

            System.out.println("nhập vào lựa chon của bạn");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    for(int i = 0; i<arr.length;i++)
                            System.out.println(+ arr[i]);
                break;
                case 2:
                    int [] arr2= new int[arr.length+1];
                    for(int i=0;i<arr.length;i++){
                        arr2[i]=arr[i];
                    }
                    arr2[arr2.length-1]=sc.nextInt();
                    System.out.println(Arrays.toString(arr2));
                    break;
                case 3:
                    int index;
                    System.out.println("nhập vị trí cần sửa");
                    index=sc.nextInt();
                    int value;
                    System.out.println("nhập giá trị cần sửa");
                    value=sc.nextInt();
                    arr[index]=value;
                    System.out.println(Arrays.toString(arr));
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                case 5:
                    int [] b= new int[arr.length-1];
                    int vt = sc.nextInt();
                    for(int i= 0; i<arr.length;i++){
                        if( i <vt){
                            b[i]= arr[i];
                        }else if( i== vt){
                            continue;
                        }else {
                            b[vt]= arr[i];
                            vt++;
                        }
                        System.out.println(Arrays.toString(b));
                    }

            }
        }while (chon!=4);
    }
}
