package com.programming.seekho.stringtemplate;

public class StringTemplateDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //String result = STR."\{a} + \{b} = \{a+b}";

        System.out.println(a+b);
        System.out.println("("+" a"+" +"+" b"+" )"+" = "+(a+b));
        System.out.println("( a + b ) = ( a + b )");
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println("{a} + {b} = {a+b}");
        //System.out.println("\{a} + \{b} = \{a+b}");

    }
}
