package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(6);
        list.add(1);

        System.out.println("Original List -> " + list);

        // Filter Method
        List<Integer> greaterThanThree = list.stream().filter(n -> n > 3).collect(Collectors.toList());
        List<Integer> evenNumbers = list.stream().filter(even -> even % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers -> " + evenNumbers + "\nNumber Greater Than 3 -> " + greaterThanThree);

        // Map Method
        List<Integer> multiplyList = list.stream().map(num -> num * 3).collect(Collectors.toList());
        System.out.println("Multiplying By 3 -> " + multiplyList);

        // Distinct Method
        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Elements -> " + uniqueList);

        // Sorted Method
        System.out.println("Sorted List -> " + uniqueList.stream().sorted().collect(Collectors.toList()));

        list.stream().map(num -> num * 5).forEach(System.out::println);

        // Limit Method
        List<Integer> firstFive = list.stream().limit(5).collect(Collectors.toList());
        System.out.println("First Five ->" + firstFive);

        // Skip Method
        System.out.println("After First 4 -> " + list.stream().skip(4).collect(Collectors.toList()));

        Object[] arr = list.stream().toArray();
        Optional minValue = list.stream().min(Integer::compare);
        System.out.println("Min Number - " + minValue==null?"No Min Found":minValue.get());
        Optional maxValue = list.stream().max(Integer::compare);
        System.out.println("Max Number - " + maxValue==null?"No Max Found":maxValue.get());

        System.out.println("Total Elements Are - " + list.stream().count());

        // FindFirst for first Element
        Optional<Integer> ans = list.stream().findFirst();
        System.out.println("First Occurrence of 1" + ans==null?"Empty List":ans.get());

        // FindAny :- Returns Any One Element From Stream Randomly
        Optional<Integer> find = list.stream().findAny();
        System.out.println("Find Any -->> " + find==null?"Empty List":find.get());

        // Reduce Method
        int sum = list.stream().reduce(0, (total, num) -> total+num);
        System.out.println("Sum Of List Elements - "+sum);

        List<String> str = new ArrayList<>();
        str.add("j"); str.add("a"); str.add("y");
        str.add("a"); str.add("n"); str.add("t");
        System.out.println(str.stream().reduce("", (tot, el) -> tot+el));

    }
}
