package com.programming.seekho;

import java.util.Arrays;
import java.util.List;

public class VarKeywordAsGeneric {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Programming", "Seekho", "Blog");
        System.out.println(words);

        //var can not be used as generic type
        //var<String> words1 = Arrays.asList("Programming", "Seekho", "Blog");
        //System.out.println(words1);

        //var can not be used with generic type
        //var<var> words2 = Arrays.asList("Programming", "Seekho", "Blog");
        //System.out.println(words2);


    }
}
