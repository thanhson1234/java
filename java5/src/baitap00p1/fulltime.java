package baitap00p1;

public class fulltime extends quanLyNhanVien {
    private double salary=10;

    public fulltime() {
    }

    public fulltime(double salary) {
        this.salary = salary;
    }

    public fulltime(double id, String name, int age, String address, double salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Luong =" + salary;
    }
}
