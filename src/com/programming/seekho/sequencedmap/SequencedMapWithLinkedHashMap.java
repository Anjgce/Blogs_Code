package com.programming.seekho.sequencedmap;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedMapWithLinkedHashMap {
    public static void main(String[] args) {
        //Map<Integer, String> hmap = new LinkedHashMap<>();
        SequencedMap<Object, Object> hmap = new LinkedHashMap<>();
        hmap.put(1, "Rajesh");
        hmap.put(2, "Ramesh");
        hmap.put(3, "Shankar");

        //Add the first element in map old approach
        //method is missing

        //Add the first element in map new approach
        hmap.putFirst(4, "John");
        System.out.println("Added the first element in linked hash map using new approach : "+hmap);

        //Get the first element in map with old approach
        //method is missing

        //Get the first element in map with new approach
        System.out.println("Get the first element in linked hash map using new approach: "+hmap.firstEntry());

        //Remove the first element from the map using old approach
        //method is missing

        //Remove the first element from the map using new  approach
        System.out.println("Remove the first element in linked hash map using new approach: "+hmap.pollFirstEntry());

        //Get the last element from map using old approach
        //method is missing

        //Get the last element from map using new approach
        System.out.println("Get the last element from linked hash map using new approach : "+hmap.pollLastEntry());

    }
}
