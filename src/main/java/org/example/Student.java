package org.example;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Student {
    @NonNull
    private String name;
    @NonNull
    private int ID;

    @NonNull
    private String contactNumber;
    private String emailAddress;
    private List<Course> courseList = new ArrayList<Course>();

    public void addCourse(Course c)
    {
        courseList.add(c);
    }
    public void removeCourse(Course c)
    {
        courseList.remove(c);
    }
    public void listCourses()
    {
        courseList.forEach(course -> System.out.println(course));
    }
    public void sendMessage(String text)
    {
        sendSms(contactNumber, text);
    }
    private void sendSms(String number, String text)
    {
        System.out.println(text + " is sent to "+number);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
