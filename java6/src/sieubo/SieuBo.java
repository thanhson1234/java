package sieubo;

public class SieuBo {
    private String Name;
    private String date;
    private String sex;
    private String address;

    public SieuBo() {
    }

    public SieuBo(String name, String date, String sex, String address) {
        Name = name;
        this.date = date;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SieuBo{" +
                "Name='" + Name + '\'' +
                ", date='" + date + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
