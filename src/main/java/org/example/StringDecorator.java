package org.example;
public class StringDecorator extends Decorator {
    @java.lang.Override
    public java.lang.String toString() {
        return student.toString();
    }
    public StringDecorator(Student s) {
        super(s);
    }
}
