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
    private List<Person> personList = new ArrayList<Person>();




    public void addPerson(Person p)
    {
        personList.add(p);
        p.addCourse(this);
    }
    public void removeStudent(Person p)
    {
        personList.remove(p);
        p.removeCourse(this);
    }
    public void listStudents(){
        for (Person p : personList ) {
            if (p instanceof Student)
                System.out.println(p);
        }
    }
    public void sendInformation(String message)
    {
        for (Person p: this.personList
             ) {
            p.sendMessage(message);
        }
    }
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
