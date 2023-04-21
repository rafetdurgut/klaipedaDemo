package org.example;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public abstract class Person {
    @NonNull
    protected String name;
    @NonNull
    protected int ID;

    @NonNull
    protected String contactNumber;
    protected String emailAddress;
    protected List<Course> courseList = new ArrayList<Course>();

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
    public void databaseConnection()
    {
        System.out.println("Connect to db");
    }
}
