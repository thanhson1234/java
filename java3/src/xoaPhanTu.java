import java.util.Scanner;

public class xoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[]{
                1,2,3,4,5
        };
        int[] b = new int[a.length-1];
        System.out.println("nhập vào vị trí");
        int index = sc.nextInt();
//        for(int i = 0; i<b.length;i++){
//            if( i<index){
//                b[i]= a[i];
//            }else {
//                b[i]=a[i+1];
//            }
//        }
        for(int i = 0; i<a.length;i++){
            if(i<index){
                b[i]= a[i];
            }else if(i == index){
                continue;
            }else {
                b[i-1]=a[i];
            }
        }
        for (int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
