package org.example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Correntin",320,"34567");
        Student s2 = new Student("Thomas",321,"34568");
        Student s3 = new Student("Patrick",322,"34569");

        Professor p1 = new Professor("Birute",123,"4345");

        Course c1 = new Course("Programming In Java",1);
        c1.setProfessor(p1);

        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);

        c1.listStudents();
        
        c1.sendInformation("test");
    }
}
