package oop2;

public class rectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle= new Rectangle(2.3,5.6);
        System.out.println(rectangle);

        rectangle= new Rectangle(2.3,4.3,"red",true);
        System.out.println(rectangle);
    }
}
