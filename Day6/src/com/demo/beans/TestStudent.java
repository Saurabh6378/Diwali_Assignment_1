package com.demo.beans;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();
        students.add(new Student(01,"saurabh","java",90.00,85));
        students.add(new Student(02,"shivam","java",95.00,65));
        students.add(new Student(03,"pratik","java",65.00,87));
        students.add(new Student(04,"rohan","java",53.00,95));
        students.add(new Student(05,"raju","java",87.00,85));
        students.add(new Student(06,"gaurav","java",88.00,85));
        students.add(new Student(07,"anuj","java",45.00,85));
        students.add(new Student(8,"sairaj","java",95.00,85));
        students.add(new Student(9,"om","java",67.00,85));
        students.add(new Student(10,"shankar","java",72.00,85));

        for(Student s: students){
            try{
               Student.calculateGrade(s);
            }catch(LowAttendanceException e){
                System.out.println(e.getMessage());
            }
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentData"))){
            oos.writeObject(students);
            System.out.println("data is saved successfullly in file");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        Collections.sort(students);
        System.out.println("decrement order of attendace percent");
        for(Student s : students){
            System.out.println(s);
        }



    }
}