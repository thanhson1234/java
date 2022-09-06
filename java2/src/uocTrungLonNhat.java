import java.util.Scanner;

public class uocTrungLonNhat {
    public static void main(String[] args) {
        int a ;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số a");
        a = sc.nextInt();
        System.out.println("nhập vào số b");
        b= sc.nextInt();
        for(int i =0; i<=a;i--){
            if (a %i==0){
                if(b%i==0){
                    System.out.println("là ước trung lớn nhất");
                }
            }
        }
    }
}
