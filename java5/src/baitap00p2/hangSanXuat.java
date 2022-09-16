package baitap00p2;

public class hangSanXuat {
    private  String tenhangsanxuat, tenquocGia;

    public String getTenhangsanxuat() {
        return tenhangsanxuat;
    }

    public void setTenhangsanxuat(String tenhangsanxuat) {
        this.tenhangsanxuat = tenhangsanxuat;
    }

    public String getTenquocGia() {
        return tenquocGia;
    }

    public void setTenquocGia(String tenquocGia) {
        this.tenquocGia = tenquocGia;
    }

    public hangSanXuat(String tenhangsanxuat, String tenquocGia) {
        this.tenhangsanxuat = tenhangsanxuat;
        this.tenquocGia = tenquocGia;

    }
}
