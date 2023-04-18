package org.example.factory;

import java.util.Scanner;

public class GenerateInterest {
    public static void main(String[] args) {
        InterestFactory factory = new InterestFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Scheme(FD/SAVING) : ");
        String scheme = sc.next();
        System.out.println("Enter Principal : ");
        double p = sc.nextDouble();
        System.out.println("Enter Year/Years : ");
        int y = sc.nextInt();
        Interest in = factory.getPlan(scheme);
        in.getRate();
        in.calculateInterest(p,y);
    }
}
