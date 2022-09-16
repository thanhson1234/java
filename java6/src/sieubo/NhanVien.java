package sieubo;

public class NhanVien extends SieuBo{
    private String congviec;

    public NhanVien() {
    }

    public NhanVien(String congviec) {
        this.congviec = congviec;
    }

    public NhanVien(String name, String date, String sex, String address, String congviec) {
        super(name, date, sex, address);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return super.toString() +
                "congviec='" + congviec;
    }
}
