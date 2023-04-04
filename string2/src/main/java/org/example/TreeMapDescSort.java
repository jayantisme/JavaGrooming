package org.example;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/*
keySet() - It returns a set view of keys.
entrySet() - It returns all the mapping present in the map, i.e, it returns set of key-value pairs.
 */

class Employee implements Comparable{
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

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        return emp.getEmpId() - this.getEmpId();
    }
}

public class TreeMapDescSort {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        map.put(1, "Jayant");
        map.put(3,"Aman");
        map.put(2,"Nirmit");
        map.put(5,"Arjun");
        map.put(4,"Anjali");

        System.out.println("Descending Order Sorted Tree Map");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Student TreeMap
        Map<Employee, Integer> employeeMap = new TreeMap<>();
        employeeMap.put(new Employee(1,"Jayant"), 10000);
        employeeMap.put(new Employee(4,"Nirmit"), 20000);
        employeeMap.put(new Employee(2,"Arjun"), 30000);
        employeeMap.put(new Employee(3,"Anjali"), 90000);

        System.out.println("Descending Order Sorted Tree Map Using Comparable");
        System.out.println(employeeMap);

    }

}
