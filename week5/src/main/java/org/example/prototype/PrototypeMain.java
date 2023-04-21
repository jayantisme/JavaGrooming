package org.example.prototype;

import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        // If we didn't provide object cloning then we will have to call loadData multiple time
        // which is costly operation.
        Student student = new Student();
        student.loadData();

        Student copyStudent1 = (Student) student.clone();
        Student copyStudent2 = (Student) student.clone();

        List<String> newList = copyStudent1.getStudentList();
        newList.add("Chirag");

        List<String> newList1 = copyStudent2.getStudentList();
        newList1.remove("Janvi");

        System.out.println(student.getStudentList());
        System.out.println(newList);
        System.out.println(newList1);
    }
}
