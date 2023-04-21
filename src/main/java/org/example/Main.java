package org.example;

public class Main {
    public static void main(String[] args) {
        Person s1 = new Student("Correntin",320,"34567");
        Student s2 = new Student("Thomas",321,"34568");
        Student s3 = new Student("Patrick",322,"34569");

        Professor p1 = new Professor("Birute",123,"4345");
        Technical t1 = new Technical("Technician",333,"232");

        Course c1 = new Course("Programming In Java",1);


        c1.addPerson(p1);
        c1.addPerson(t1);

        c1.addPerson(s1);
        c1.addPerson(s2);
        c1.addPerson(s3);

        c1.listStudents();

        c1.sendInformation("test");
    }
}
