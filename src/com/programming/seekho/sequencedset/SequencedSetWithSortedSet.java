package com.programming.seekho.sequencedset;

import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;

public class SequencedSetWithSortedSet {
    public static void main(String[] args) {
        SequencedSet<Integer> set = new LinkedHashSet<>();
        set.add(4);
        set.add(2);
        set.add(3);

        System.out.println(set);

        //Add the first element in set with old approach
        //Method is missing

        //Add the first element in set with new approach
        set.addFirst(10);
        System.out.println("Add the first element in set with new approach : "+set);



        //Get the first element in set with old approach
        System.out.println("Get the first element in set with old approach : "+set.iterator().next());


        //Get the first element in set with new approach
        System.out.println("Get the first element in set with new approach : "+set.getFirst());

        //Get the last element from the set with old approach
        //method is missing
        //System.out.println("Get the last element in set with old approach : "+set.iterator().next());

        //Get the last element from the set with new approach
        System.out.println("Get the last element in set with old approach : "+set.getLast());

        //Remove the first element from set using old approach
        System.out.println("Remove "+set.remove(4));

        //Remove the first element from set using new approach
        System.out.println("Remove "+set.removeFirst());

    }
}
