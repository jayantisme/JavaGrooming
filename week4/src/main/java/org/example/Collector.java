package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collector {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("j", "a", "y", "a", "n", "t");
        List<String> collectList = list.stream().collect(Collectors.toList());
        List<String> unmodifiableList = list.stream().collect(Collectors.toUnmodifiableList());
        Set<String> collectSet = list.stream().collect(Collectors.toSet());
        Set<String> unmodifiableSet = list.stream().collect(Collectors.toUnmodifiableSet());



    }
}
