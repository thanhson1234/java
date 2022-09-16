package test;

public class hinhtron extends hinh{
    protected double r;
    public hinhtron(test.toado toado, int i) {
        super(toado);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhdientich() {
        return Math.PI*this.r*this.r;
    }
}
