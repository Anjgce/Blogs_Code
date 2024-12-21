package com.programming.seekho;

import java.util.*;

public class VarKeywordWithCollections {

    public static void main(String[] args) {

        //ArrayList<String> names = new ArrayList<>();
        var names = new ArrayList<>();
        names.add("Ramesh");
        names.add("John");
        names.add("Doe");
        names.add("Brian");

        System.out.println(names);

        var list = Arrays.asList("Ramesh","Kumar","Sunny", "john");
        System.out.println(list);

        var set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);

        var map = new HashMap<>();
        map.put(10,"Raju");
        map.put(20,"Mukesh");
        map.put(30,"Kamla");
        map.put(40,"Kamlesh");

        System.out.println(map);
    }

}
