package sieubo;

import java.util.Arrays;
import java.util.Scanner;

public class Manage {
    SieuBo[] nhanvien = {};
    Scanner sc = new Scanner(System.in);

    public void thongtin() {
        SieuBo[] themNV = new SieuBo[nhanvien.length + 1];
        SieuBo nhanvienD = taonhanvien();
        for (int i = 0; i < nhanvien.length; i++) {
            themNV[i] = nhanvien[i];
        }
        themNV[themNV.length - 1] = nhanvienD;
        nhanvien = themNV;
        System.out.println(Arrays.toString(nhanvien));
    }

    public SieuBo taonhanvien(){
        System.out.print("nhập name: ");
        String name = sc.nextLine();

        System.out.print("Nhập ngày tháng năm sinh: ");
        String date = sc.nextLine();

        System.out.print("Nhập giới tính ");
        String sex = sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("nhập loại cán bộ     1. công nhân       2.Kĩ sư             3. Nhân viên ");
        int loai= Integer.parseInt(sc.nextLine());
        SieuBo nvm;
        if(loai==1){
            System.out.println("nhập cấp bậc");
            double Capbac= Integer.parseInt(sc.nextLine());
            nvm=new CongNhan(name,date,sex,address,Capbac);
        }else if (loai==2){
            System.out.println("nhập ngành đào tạo");
            String NDT= sc.nextLine();
            nvm=new KySu(name,date,sex,address,NDT);
        }else {
            System.out.println("nhập công việc");
            String congviec = sc.nextLine();
            nvm=new NhanVien(name,date,sex,address,congviec);
        }
        return nvm;
    }
}
