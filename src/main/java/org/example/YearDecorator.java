package org.example;
public class YearDecorator extends Decorator{
    protected int year;
    public YearDecorator(Student s) {
        super(s);
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  student.toString()+ ", year=" + year;

    }
}
