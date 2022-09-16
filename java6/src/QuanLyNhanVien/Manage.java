package QuanLyNhanVien;

import java.util.Scanner;

public class Manage {
    QuanLyNhanVien[] nhanvien = {};
    Scanner sc = new Scanner(System.in);

    public void Hienthi() {
        for (int i = 0; i < nhanvien.length; i++) {
            System.out.println(nhanvien[i]);
        }
        System.out.println();
    }

    public void Them() {
        QuanLyNhanVien[] nhanVienMoi = new QuanLyNhanVien[nhanvien.length + 1];
        QuanLyNhanVien nv = taonhanvien();
        for (int i = 0; i < nhanvien.length; i++) {
            nhanVienMoi[i] = nhanvien[i];
        }
        nhanVienMoi[nhanVienMoi.length - 1] = nv;
        nhanvien = nhanVienMoi;
    }

    public QuanLyNhanVien taonhanvien() {
        System.out.print("nhập id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("Chọn loại nhân viên:  1 Full-Time      2 Part-Time");
        int loai = Integer.parseInt(sc.nextLine());
        QuanLyNhanVien nvm;
        if (loai == 1) {
            System.out.println("nhập luong");
            double luong = Integer.parseInt(sc.nextLine());
            nvm = new Fulltime(id, name, age, address, luong);
        } else {
            System.out.println("Nhập ngày đi làm");
            int ngaydilam = Integer.parseInt(sc.nextLine());
            nvm = new Fulltime(id, name, age, address, ngaydilam);
        }
        return nvm;
    }
}
