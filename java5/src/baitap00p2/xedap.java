package baitap00p2;

public class xedap extends phuongTiendiChuyen{
    private String loannhieuLieu;

    public xedap( baitap00p2.hangSanXuat hangSanXuat, String loannhieuLieu) {
        super("xe đạp", hangSanXuat);
        this.loannhieuLieu = loannhieuLieu;
    }

    public String getLoannhieuLieu() {
        return loannhieuLieu;
    }

    public void setLoannhieuLieu(String loannhieuLieu) {
        this.loannhieuLieu = loannhieuLieu;
    }

    @Override
    public double LayVanToc() {
        return 20;
    }
}
