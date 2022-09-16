package baitap00p1;

import java.util.Scanner;

public class mainQLSV {
    static quanLyNhanVien[] quanly;
    public static void main(String[] args) {
        int id;
        String name;
        int age;
        String address;
        fulltime fulltime = new fulltime(1, "son", 27, "hn", 1000.0);
        pattime pattime = new pattime(2, "ngu", 18, "hn", 2);
        quanly = new quanLyNhanVien[10];
        int nv=2;
        quanly[0] = fulltime;
        quanly[1] = pattime;
        for (int i = 0; i < 2; i++) {
            if (quanly[i] instanceof pattime) {
                pattime pt = (pattime) quanly[i];
                System.out.println(pt.getName());
            } else {
                System.out.println("Đây ko phải là nv parttinme");
            }
        }






        System.out.println("manu");
        System.out.println("nhập id");
        System.out.println("tên");
        System.out.println("tuổi");
        System.out.println("địa chỉ");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. hiển thị nhân viên");
            System.out.println("2. thêm nhân viên");
            System.out.println("3. Exit");
            int chon= sc.nextInt();
            switch (chon){
                case 1:
                    for(int i=0;i<nv;i++){
                        System.out.println(quanly[i].toString());
                    }
                    break;
                case 2:                         // nhập nhân viên full time
                    System.out.println("nhập nhân viên full time");
                    System.out.println("nhập id");
                    id = sc.nextInt();
                    System.out.println("tên");
                    sc.nextLine();
                     name = sc.nextLine();
                    System.out.println("tuổi ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("địa chỉ");
                    address = sc.nextLine();
                    System.out.println("lương");
                    double salary= sc.nextDouble();
                    quanly[nv] = new fulltime(id,name,age,address,salary);
                    nv++;
                    break;
                case 3:                             // nhập nhân viên parttime
                    System.out.println("nhập nhân viên full time");
                    System.out.println("nhập id");
                    id = sc.nextInt();
                    System.out.println("tên");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("tuổi ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("địa chỉ");
                     address = sc.nextLine();
                    System.out.println("day");
                    int day= sc.nextInt();
                    quanly[nv] = new fulltime(id,name,age,address,day);
                    nv++;
                case 4:
                    quanLyNhanVien[] delete= new quanLyNhanVien[quanly.length];
                    int index= sc.nextInt();
                    for(int i=0; i<nv;i++){
                        if(i < index){
                            delete[i] = quanly[i];
                        }else {
                            delete[i]= quanly[i+1];
                        }
                    }
                    quanly = delete;
                case 5:
                    System.exit(0);
            }


        }



    }

}
