package baitap00p2;

public class test {
    public static void main(String[] args) {
        hangSanXuat h1 = new hangSanXuat("hãng 1", "v");
        hangSanXuat h2 = new hangSanXuat("hãng 2", "t");
        hangSanXuat h3 = new hangSanXuat("hãng 3", "a");

        phuongTiendiChuyen p1 = new oTo(h1,"trường hải");
        phuongTiendiChuyen p2 = new mayBay(h2,"xăng");
        phuongTiendiChuyen p3 = new xedap(h2,"xăng");
    }
}
