package org.example;
public class Student {
    String nume;
    String prenume;
    public Student(){}
    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Student(String nume, String prenume) {
        this.prenume = prenume;
        this.nume=nume;
    }

    @Override
    public String toString() {
        return "Student" +
                " nume='" + nume + '\'' +
                ", prenume='" + prenume+'\'';
    }
}
