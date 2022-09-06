import java.util.Scanner;

public class hienThicacloanKe {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right):");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int sao;
        sao = sc.nextInt();
        switch (sao) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 8; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i =1 ;i<=5;i++){
                    for(int j=1; j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i =7 ;i>=1;i--){
                    for(int j=1;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
