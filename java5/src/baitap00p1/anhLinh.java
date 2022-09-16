package baitap00p1;

public class anhLinh extends quanLyNhanVien {
    @Override
    public int getArea(int id) {
        return super.getArea(id*2);
    }
    public double getArea( double id){
        return id/2;
    }
}
