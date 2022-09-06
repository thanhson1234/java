import java.util.Scanner;

public class khaiBaosoNguyen {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            boolean check = true;
            if (count == 20) {
                break;
            }
            if (count < number) {
                for (int j = 2; j < i; j++) {
                    if (i%j == 0){
                        check = false;
                    }
                }
                if(check){
                    System.out.println(i);
                    count++;
                }
            }
        }
    }
}
