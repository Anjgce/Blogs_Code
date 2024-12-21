package com.programming.seekho;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarKeywordWithStreamAPI {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Anamika", "Anil", "John", "Bhimraj");
        var sortedName = list.stream().sorted().toList();
        sortedName.forEach(System.out::println);
    }
}
