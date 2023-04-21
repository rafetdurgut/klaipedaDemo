package org.example;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Course {
    @NonNull
    private String name;
    @NonNull
    private int ID;
    private List<Student> studentList = new ArrayList<Student>();

    public void setProfessor(Professor professor) {
        professor.addCourse(this);
        this.professor = professor;
    }

    private Professor professor;

    public void addStudent(Student s)
    {
        studentList.add(s);
        s.addCourse(this);
    }
    public void removeStudent(Student s)
    {
        studentList.remove(s);
        s.removeCourse(this);
    }
    public void listStudents(){
        for (Student s : studentList ) {
            System.out.println(s);
        }
    }
    public void sendInformation(String message)
    {
        for (Student s: this.studentList
             ) {
            s.sendMessage(message);
        }
    }
    public void databaseConnection()
    {
        System.out.println("Connect to db");
    }
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
