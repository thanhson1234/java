package baitap00p2;

public abstract class phuongTiendiChuyen {
    protected String tenLoanPhuongTien;
    protected hangSanXuat hangSanXuat;


    public phuongTiendiChuyen(String tenLoanPhuongTien,hangSanXuat hangSanXuat) {
        this.tenLoanPhuongTien = tenLoanPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoanPhuongTien() {
        return tenLoanPhuongTien;
    }

    public void setTenLoanPhuongTien(String tenLoanPhuongTien) {
        this.tenLoanPhuongTien = tenLoanPhuongTien;
    }

    public baitap00p2.hangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(baitap00p2.hangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    public String LayTenHangSanxuat(){
        return this.hangSanXuat.getTenhangsanxuat();
    }
    public void BatDau(){
        System.out.println("bắt đầu");
    }
    public  void TangToc(){
        System.out.println("tăng tốc");
    }
    public void DungLai(){
        System.out.println("dừng lại");
    }
    public abstract double LayVanToc();
}
