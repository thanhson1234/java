package oop;

public class khoiTao {
    double wight, height;

    public khoiTao() {
    }

    public khoiTao(double wight, double height) {
        this.wight = wight;
        this.height = height;

    }

    public double khoiTao() {
        return (this.wight + this.height) * 2;
    }
    public String dientich(){

        return ""+this.wight*this.height;
    }
}
