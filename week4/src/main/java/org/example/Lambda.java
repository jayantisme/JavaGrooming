package org.example;

import java.util.ArrayList;
import java.util.List;

interface Eatable {
    void eat();
}

interface Summable {
    int add(int a, int b);
}
public class Lambda {
    public static void main(String[] args) {
        // Using Anonymous Class
        Eatable e = new Eatable() {
            @Override
            public void eat() {
                System.out.println("I'm Eating With Class");
            }
        };

        e.eat();

        Eatable lambdaEat = () -> System.out.println("I'm Eating With Lambda");
        lambdaEat.eat();

        Summable s = new Summable() {
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(s.add(5,5));
        Summable sum = (a,b) -> {
            return a+b;
        };
        System.out.println(sum.add(3,5));

        Summable withoutReturnSum = (a,b) -> (a+b);
        System.out.println(withoutReturnSum.add(25,35));

        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
//        list.forEach( (n) -> System.out.println("Value "+n));
        list.forEach(System.out::println);

    }
}
