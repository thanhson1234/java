package baitap00p2;

public class oTo extends phuongTiendiChuyen {
    private  String loanNhienLieu;

    public oTo( baitap00p2.hangSanXuat hangSanXuat, String loanNhienLieu) {
        super("oto", hangSanXuat);
        this.loanNhienLieu = loanNhienLieu;
    }

    public String getLoanNhienLieu() {
        return loanNhienLieu;
    }

    public void setLoanNhienLieu(String loanNhienLieu) {
        this.loanNhienLieu = loanNhienLieu;
    }

    @Override
    public double LayVanToc() {
        return 60;
    }
}
