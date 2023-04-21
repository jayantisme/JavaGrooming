package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable{
    private List<String> studentList;
    public Student(){
        studentList = new ArrayList<>();
    }
    public Student(List<String> studentList){
        this.studentList = studentList;
    }
    public void loadData() {
        studentList.add("Jayant");
        studentList.add("Aman");
        studentList.add("Manish");
        studentList.add("Anjali");
        studentList.add("Janvi");
    }
    public List<String> getStudentList(){
        return studentList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : this.getStudentList()){
            temp.add(s);
        }
        return new Student(temp);
    }
}
