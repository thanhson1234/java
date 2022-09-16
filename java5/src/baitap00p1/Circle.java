package baitap00p1;

public class Circle {
    private double bankinh = 1.0;
    private String color = "";

    public Circle() {
    }

    public Circle(double bankinh, String color) {
        this.bankinh = bankinh;
        this.color = color;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "đường tròn" +
                "" + bankinh +
                ", color='" + color + '\'' +
                '}';
    }
}
