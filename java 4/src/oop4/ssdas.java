package oop4;

public class ssdas extends mydate{
private String lop;

    public ssdas(String lop) {
        this.lop = lop;
    }

    public ssdas(int day, int month, int year, String lop) {
        super(day, month, year);
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
