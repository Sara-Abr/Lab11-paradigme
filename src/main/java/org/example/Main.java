package org.example;
public class Main {
    public static void main(String[] args) {
        Student s= new Student("A", "B");
        Tiparire(s);
        YearDecorator y= new YearDecorator(s);
        y.setYear(2);
        Tiparire(y);
        StringDecorator str= new StringDecorator(s);
        Tiparire(str);
    }
    public static void Tiparire(Student s)
    {
        System.out.println(s);
    }
}