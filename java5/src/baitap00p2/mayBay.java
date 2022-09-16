package baitap00p2;

public class mayBay extends phuongTiendiChuyen{
    private String LoanNhienLieu;

    public mayBay( hangSanXuat hangSanXuat, String loanNhienLieu) {
        super("máy bay", hangSanXuat);
        LoanNhienLieu = loanNhienLieu;
    }

    public String getLoanNhienLieu() {
        return LoanNhienLieu;
    }

    public void setLoanNhienLieu(String loanNhienLieu) {
        LoanNhienLieu = loanNhienLieu;
    }

    @Override
    public double LayVanToc() {
        return 500;
    }
    public void CatCanh(){
        System.out.println("cất canh");
    }
    public  void HaCanh(){
        System.out.println("hạ cánh");
    }
}
