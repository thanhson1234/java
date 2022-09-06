import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println( " enter a year");
        year = scanner.nextInt();
        if(year% 4 ==0 ){
            if(year%100 == 0){
                if( year%400 == 0){
                    System.out.println(" là năm nhuận"+year);
                }else {
                    System.out.println("không phải năm nhuận"+year);
                }
            }else {
                System.out.println(" là năm nhuận"+year);
            }

        }else {
            System.out.println("không phải năm nhuận"+ year);
        }
    }
}
