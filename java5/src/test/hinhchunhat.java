package test;

public class hinhchunhat extends hinh {
    private double rong, cao;

    public hinhchunhat(test.toado toado, double rong, double cao) {
        super(toado);
        this.rong = rong;
        this.cao = cao;
    }

    @Override
    public double tinhdientich() {
        return this.rong*this.cao;
    }
}
