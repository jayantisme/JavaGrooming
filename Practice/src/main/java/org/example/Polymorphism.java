package org.example;

class Employee {
    int bonus() {
        return 500;
    }
}
class Sde extends Employee{
    @Override
    int bonus() {
        return 1000;
    }
}
class Manager extends Employee {
    @Override
    int bonus(){
        return 2000;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Sde s = new Sde();
        Manager m = new Manager();
        System.out.println(s.bonus());  // 1000
        System.out.println(m.bonus());  // 2000
    }
}
