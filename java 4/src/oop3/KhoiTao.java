package oop3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class KhoiTao {
    private LocalDateTime startime;
    private LocalDateTime endtime;

    public KhoiTao() {

    }

    public KhoiTao(LocalDateTime startime, LocalDateTime endtime) {
        this.startime = startime;
        this.endtime = endtime;
    }

    public LocalDateTime getStartime() {
        return startime;
    }

    public void setStartime(LocalDateTime startime) {
        this.startime = startime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    public void start(){
        startime = LocalDateTime.now();
    }
    public void stop(){
        endtime= LocalDateTime.now();
    }
    public int getElapsedTime(){
        return endtime.getSecond() - startime.getSecond();
    }

    @Override
    public String toString() {
        return
                "startime=" + startime +
                ", endtime=" + endtime ;
    }

    public static void main(String[] args) {
        KhoiTao run = new KhoiTao();
        run.start();
        Scanner ts= new Scanner(System.in);
        ts.next();
        run.stop();
        System.out.println(run.getStartime());
        System.out.println(run.getElapsedTime());
    }
}
