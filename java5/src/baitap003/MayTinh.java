package baitap003;

public class MayTinh {
    private HangSanXuat hangSanXuat ;
    private int ngaySanXuat;
    private double giaBan;
    private double thoigianBan;

    public MayTinh() {
    }

    public MayTinh(HangSanXuat hangSanXuat, int ngaySanXuat, double giaBan, double thoigianBan) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoigianBan = thoigianBan;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(int ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double isThoigianBan() {
        return thoigianBan;
    }

    public void setThoigianBan(double thoigianBan) {
        this.thoigianBan = thoigianBan;
    }
    public boolean kienTraMayTinh(MayTinh khac){
        return this.giaBan< khac.giaBan;
    }
    public Quocgia LayTenQUocGia(){
        return this.hangSanXuat.getQuocgia();
    }
}
