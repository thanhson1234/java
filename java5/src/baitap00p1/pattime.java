package baitap00p1;

public class pattime extends quanLyNhanVien{
    private int day;

    public pattime() {

    }

    public pattime(int day) {
        this.day = day;
    }

    public pattime(double id, String name, int age, String address, int day) {
        super(id, name, age, address);
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public double day(){
        return day*120000;
    }

    @Override
    public String toString() {
        return "pattime{" +
                "day=" + day +
                '}';
    }
}
