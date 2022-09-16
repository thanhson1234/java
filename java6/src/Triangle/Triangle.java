package Triangle;

public class Triangle extends Shape {
    public String coler;

    public Triangle() {
        super();
    }

    public Triangle(String coler) {
        this.coler = coler;
    }

    public Triangle(double side1, double side2, double side3, String coler) {
        super(side1, side2, side3);
        this.coler = coler;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }
    public double getArea(){
        double p=getPerimeter()/2;
        return Math.sqrt(p+(p-super.getSide1())
                +(p-super.getSide2())
                +(p-super.getSide3()));
    }
    public double  getPerimeter(){
        return super.getSide1()+super.getSide2()+super.getSide3();
    }

    @Override
    public String toString() {
        return super.toString()+
                "coler='" + coler ;
    }
}
