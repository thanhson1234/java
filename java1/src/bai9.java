import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        System.out.println("nhập số");
        Scanner so = new Scanner(System.in);
        int a= so.nextInt();
        so.nextLine();
        String name;
        switch (a) {
            case 0:
                name = "zero";
                break;
            case 1:
                name = "one";
                break;
            case 2:
                name = "two";
                break;
            case 3:
                name = "three";
                break;
            case 4:
                name = "four";
                break;
            case 5:
                name = "fine";
                break;
            case 6:
                name = "six";
                break;
            case 7:
                name = "seven";
                break;
            case 8:
                name = "eight";
                break;
            case 9:
                name = "nine";
                break;
            case 10:
                name = "ten";
                break;
            case 11:
                name = "eleven";
                break;
            case 12:
                name = "twelve";
                break;
            case 13:
                name = "thirteen";
                break;
            case 20:
                name = "twenty";
                break;
            default:
                name = "";
                break;
        }

        if(a>=0&&a<=13){
            System.out.println(name);
        }else if(a >13 && a <20){
            System.out.println(name+"teen");
        }else if(a == 20){
            System.out.println(name);
        }
    }
}
