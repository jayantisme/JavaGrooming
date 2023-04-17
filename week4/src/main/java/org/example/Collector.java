package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collector {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("j", "a", "y", "a", "n", "t");
        List<Integer> intList = Arrays.asList(2,1,5,3,9,7,6,8,10);
        List<String> collectList = list.stream().collect(Collectors.toList());
        List<String> unmodifiableList = list.stream().collect(Collectors.toUnmodifiableList());
        Set<String> collectSet = list.stream().collect(Collectors.toSet());
        Set<String> unmodifiableSet = list.stream().collect(Collectors.toUnmodifiableSet());
        long count = list.stream().collect(Collectors.counting());
        String ans = list.stream().collect(Collectors.joining());
        String ansWithSpaces = list.stream().collect(Collectors.joining(" "));
        System.out.println(ans);
        System.out.println(ansWithSpaces);
    }
}
