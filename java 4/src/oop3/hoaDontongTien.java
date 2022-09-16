package oop3;

import java.util.Scanner;

public class hoaDontongTien {
    private String tenLoaicaphe;
    private double giatien1kg;
    private double khoiLuong;

    public hoaDontongTien(String tenLoaicaphe, double giatien1kg, double khoiLuong) {
        this.tenLoaicaphe = tenLoaicaphe;
        this.giatien1kg = giatien1kg;
        this.khoiLuong = khoiLuong;
    }
    public double tinhTongTien(){
         return this.giatien1kg * this.khoiLuong;
    }
    public boolean sdfsdfsd(){
        return this.tinhTongTien() >50000000;
    }

    public static void main(String[] args) {
        String tenLoaicaphe;
        double giatien1kg,khoiLuong;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập tên loại cà phê, giá tiền , khối lượng");
        tenLoaicaphe = sc.nextLine();
        giatien1kg= sc.nextDouble();
        khoiLuong = sc.nextDouble();
        hoaDontongTien hd = new hoaDontongTien(tenLoaicaphe,giatien1kg,khoiLuong);
        System.out.println("tong tiien : "+hd.tinhTongTien());
    }
}