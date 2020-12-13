package lab14.ex3;

import java.util.Objects;

public class Student implements Comparable <Student>{
    private String name;
    private int age;
    private int iDNumber;
    private double gpa;

    public Student(String name,  int iDNumber, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDNumber=" + iDNumber +
                ", gpa=" + gpa +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getName() == o.getName()){
            return 1;
        }
        else return -1;
    }
    public boolean compareTo(String name){
        if (this.getName().equals(name)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                iDNumber == student.iDNumber &&
                Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, iDNumber, gpa);
    }
}

