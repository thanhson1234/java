package QuanLyNhanVien;

public class parttime extends QuanLyNhanVien{
    private int working_day;

    public parttime() {
    }

    public parttime(int working_day) {
        this.working_day = working_day;
    }

    public parttime(int id, String name, int age, String address, int working_day) {
        super(id, name, age, address);
        this.working_day = working_day;
    }

    public int getWorking_day() {
        return working_day;
    }

    public void setWorking_day(int working_day) {
        this.working_day = working_day;
    }
    public double luong(){
        return working_day*12000000;
    }

    @Override
    public String toString() {
        return super.toString()+
                "working_day=" + working_day ;
    }
}
