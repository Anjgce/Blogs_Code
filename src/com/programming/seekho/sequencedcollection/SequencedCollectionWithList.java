package com.programming.seekho.sequencedcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class SequencedCollectionWithList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //SequencedCollection<Integer> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //Add first element in the list with old approach
        list.add(0,10);
        System.out.println("Added first element in list with OLD Approach : "+list);

        //Add first element in the list with new approach
        list.addFirst(20);
        System.out.println("Added first element in list with NEW Approach : "+list);

        //Get first element in the list with old approach
        System.out.println("Get first element in list with OLD Approach : "+list.get(0));

        //Get first element in the list with new approach
        System.out.println("Get first element in list with NEW Approach : "+list.getFirst());

        //Remove first element in the list with old approach
        System.out.println("Remove first element in list with OLD Approach : "+list.remove(0));

        //Remove first element in the list with new approach
        System.out.println("Remove first element in list with NEW Approach : "+list.removeFirst());





        //Add last element in the list with old approach
        list.add(list.size()-1,10);
        System.out.println("Added last element in list with OLD Approach : "+list);

        //Add last element in the list with new approach
        list.addLast(20);
        System.out.println("Added last element in list with NEW Approach : "+list);

        //Get last element in the list with old approach
        System.out.println("Get last element in list with OLD Approach : "+list.get(list.size()-1));

        //Get last element in the list with new approach
        System.out.println("Get last element in list with NEW Approach : "+list.getLast());

        //Remove last element in the list with old approach
        System.out.println("Remove last element in list with OLD Approach : "+list.remove(list.size()-1));

        //Remove last first element in the list with new approach
        System.out.println("Remove last element in list with NEW Approach : "+list.removeLast());



    }
}
