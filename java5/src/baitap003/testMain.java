package baitap003;

public class testMain {
    public static void main(String[] args) {
        Ngay ngay1= new Ngay(23,12,2022);
        Ngay ngay2= new Ngay(12,12,2022);
        Ngay ngay3= new Ngay(21,12,2022);

        Quocgia quocgia = new Quocgia("sd","VN");
        Quocgia quocgia1 = new Quocgia("dt","TQ");
        Quocgia quocgia2 = new Quocgia("ml","USA");

        HangSanXuat hangSanXuat = new HangSanXuat("VN laptop",quocgia);
        HangSanXuat hangSanXuat1 = new HangSanXuat("VN laptop",quocgia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("VN laptop",quocgia2);

        MayTinh mayTinh = new MayTinh(hangSanXuat,2,222.4,12.1);
        MayTinh mayTinh1 = new MayTinh(hangSanXuat,2,222.2,23.1);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat,2,222.1,21.1);
        System.out.println("so sánh gia");
        System.out.println( "m1 < m2"+mayTinh.kienTraMayTinh(mayTinh1));
        System.out.println("m1 < m3"+mayTinh.kienTraMayTinh(mayTinh2));
    }
}
