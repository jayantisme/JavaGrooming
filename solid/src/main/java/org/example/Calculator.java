package org.example;

import java.util.Scanner;

public class Calculator {
    private final CalculatorOperation operation;

    public Calculator(CalculatorOperation operation) {
        this.operation = operation;
    }

    public int calculate(int a, int b){
        return operation.calculate(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER VALUE OF A :- ");
        int a = sc.nextInt();
        System.out.print("ENTER OPERATION  :- ");
        String ch = sc.next();
        System.out.print("ENTER VALUE OF B :- ");
        int b = sc.nextInt();
        int result = 0;
        switch (ch) {
            case "+" :
                Calculator  addition = new Calculator(new AdditionOperation());
                result = addition.calculate(a,b);
                System.out.println(result);
                break;
            case "-" :
                Calculator  substraction = new Calculator(new SubstractionOperation());
                result = substraction.calculate(a,b);
                System.out.println(result);
                break;
            case "*" :
                Calculator  multiplication = new Calculator(new MultiplicationOperation());
                result = multiplication.calculate(a,b);
                System.out.println(result);
                break;
            case "/" :
                Calculator  division = new Calculator(new DivisionOperation());
                result = division.calculate(a,b);
                System.out.println(result);
                break;
            default:
                System.out.println("SOME ERROR OCCUR");
        }

    }
}