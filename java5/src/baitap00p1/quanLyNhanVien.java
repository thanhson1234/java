package baitap00p1;

public class quanLyNhanVien {
    private double id;
    private  String name;
    private int age;
    private String address;

    public quanLyNhanVien() {
    }

    public quanLyNhanVien(double id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getArea( int id){
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "id=" +id
                + ", ten= " + name
                + "tuổi "+age
                + ", địa chỉ"+ address;
    }
}
