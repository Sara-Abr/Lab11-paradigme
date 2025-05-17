package org.example;
abstract class Decorator extends Student{
    protected Student student;
    public Decorator(Student s) {
        this.student = s;
    }
    public void setNume(String nume) {
        student.nume = nume;
    }

    public String getNume() {
        return student.nume;
    }

    public String getPrenume() {
        return student.prenume;
    }

    public void setPrenume(String prenume) {
        student.prenume = prenume;
    }
}
