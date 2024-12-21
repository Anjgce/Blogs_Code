package com.programming.seekho;

import java.util.function.Predicate;

public class VarKeywordWithLambdaExp {

    public static void main(String[] args) {

        Predicate<Integer> evenNumber = a -> a % 2 == 0;

        System.out.println(evenNumber.test(10));
//        var cannot be used with lambda expression
//        var evenNumber1 = a -> a % 2 == 0;
//        System.out.println(evenNumber1);
    }
}
