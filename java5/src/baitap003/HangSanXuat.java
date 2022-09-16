package baitap003;

public class HangSanXuat {
    private String hangSanXuat;
    private Quocgia quocgia;

    public HangSanXuat(String hangSanXuat, Quocgia quocgia) {
        this.hangSanXuat = hangSanXuat;
        this.quocgia = quocgia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Quocgia getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(Quocgia quocgia) {
        this.quocgia = quocgia;
    }
}
