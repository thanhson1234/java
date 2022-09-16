import java.util.Scanner;

public class ThemphanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{3, 6, 2, 6, 2};
        int[] b = new int[a.length + 1];
        System.out.println("nhập vị trí");
        int index = sc.nextInt();
        for (int i = 0; i < b.length; i++) {
            if ( i < index){
                b[i]= a[i];
            }else if(i== index){
                b[i]= 2;
            }else {
                b[i]=a[i-1];
            }
        }
        for(int i= 0; i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
