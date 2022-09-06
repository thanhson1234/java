import java.util.Scanner;

public class soNguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số từ bàn phím");
        int number = sc.nextInt();
        if(number < 2){
            System.out.println("là  không số nguyên tố"+number);
        }else {
            int i = 2;
            boolean check= true;
            while (i < number){
                if(number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println("là số nguyên tố");
            else
                System.out.println("không là số nguyên tố");
            }
        }
    }

