package org.example;


import lombok.NonNull;


public class Student extends Person {

    public Student(@NonNull String name, @NonNull int ID, @NonNull String contactNumber) {
        super(name, ID, contactNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                '}';
    }
}
