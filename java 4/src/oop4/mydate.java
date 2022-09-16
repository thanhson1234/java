package oop4;

import java.util.Objects;

public class mydate {
    private int day;
    private int month;
    private  int year;

    public mydate() {

    }

    public mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mydate mydate = (mydate) o;
        return day == mydate.day && month == mydate.month && year == mydate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
