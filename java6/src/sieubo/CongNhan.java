package sieubo;

public class CongNhan extends SieuBo{
    private double capbac;

    public CongNhan() {
    }

    public CongNhan(double capbac) {
        this.capbac = capbac;
    }

    public CongNhan(String name, String date, String sex, String address, double capbac) {
        super(name, date, sex, address);
        this.capbac = capbac;
    }

    public double getCapbac() {
        return capbac;
    }

    public void setCapbac(double capbac) {
        this.capbac = capbac;
    }

    @Override
    public String toString() {
        return super.toString() +
                "capbac=" + capbac;
    }
}
