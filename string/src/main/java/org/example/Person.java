package org.example;

import java.util.Comparator;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implementing the Comparable interface
    @Override
    public int compareTo(Person obj) {
        if (age > obj.age)
            return 1;
        else if (age < obj.age)
            return -1;
        return 0;

    }

    public static void main(String[] args) {
        Comparator<Person> nameComparator = (person1, person2) -> person1.name.compareTo(person2.name);
    }

}