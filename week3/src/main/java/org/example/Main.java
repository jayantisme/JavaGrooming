package org.example;

class Employee {
    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}
public class Main {
    public static void main(String[] args) {
        CustomArrayList<Employee> list = new CustomArrayList<>();
        list.add(new Employee(101, "Jayant"));
        list.add(new Employee(105,"Krishna"));
        System.out.println("Size Of Custom ArrayList - "+list.size());
        for (int i=0; i< list.size(); i++){
            Employee emp = list.get(i);
            System.out.println("Employee Id - "+emp.getEmpId()+" Employee Name - "+emp.getEmpName());
        }
    }
}