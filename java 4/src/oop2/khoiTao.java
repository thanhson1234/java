package oop2;

public class khoiTao {
    private double a, b, c;

    public khoiTao() {
    }

    public khoiTao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double geta() {
        return a;
    }

    public double getb() {
        return b;
    }

    public double getc() {
        return c;
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (this.delta() < 0) return 0;
        System.out.println();
        return ((-b + Math.sqrt(this.delta())) / (2 * a));
    }

    public double getRoot2() {
        if (this.delta() < 0) return 0;
        return ((-b - Math.sqrt(this.delta())) / (2 * a));
    }
}
