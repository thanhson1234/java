package oop4;

public class demo {
    private int son=0;
    static int si=10;
    private int loc =10;


    public static void main(String[] args) {
        demo sc =new demo();
        sc.si ++;
        System.out.println(sc.si);
        demo sc1 =new demo();
        System.out.println(sc1.si);
    }
}
