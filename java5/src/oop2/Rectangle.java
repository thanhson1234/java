package oop2;

import oop.Shape;

public class Rectangle extends Shape {
    private double whidth = 1.0;
    private double lenght = 1.0;
    public  Rectangle(){

    }

    public Rectangle(double whidth, double lenght) {
        this.whidth = whidth;
        this.lenght = lenght;
    }

    public Rectangle(double whidth, double lenght, String color, boolean filled) {
        super(color, filled);
        this.whidth = whidth;
        this.lenght = lenght;
    }

    public double getWhidth() {
        return whidth;
    }

    public void setWhidth(double whidth) {
        this.whidth = whidth;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return whidth *this.lenght;
    }
    public double getPerimeter(){
        return 2*(whidth+this.lenght);
    }

    @Override
    public String toString() {
        return "A Rectangle with "
                +getWhidth()
                +"anh lenght"
                +getLenght()
                + "which is a sibclass of"
                +super.toString();
    }
}
