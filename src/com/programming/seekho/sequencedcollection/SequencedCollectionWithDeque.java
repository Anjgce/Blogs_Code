package com.programming.seekho.sequencedcollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class SequencedCollectionWithDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);

        System.out.println(deque);

        //Add first element in deque with old approach
        deque.add(10);
        System.out.println("Added first element in the deque with OLD Approach : "+deque);

        //Add first element in deque with new approach
        deque.addFirst(20);
        System.out.println("Added first element in the deque with NEW Approach : "+deque);

        //Get the first element in deque with old approach
        System.out.println("Get first element in the deque with OLD Approach : "+deque.peekFirst());

        //Get the first element in deque with new approach
        System.out.println("Get first element in the deque with NEW Approach : "+deque.getFirst());

        //Remove the first element in deque with new approach
        System.out.println("Remove first element in the deque with NEW Approach : "+deque.removeFirst());

        //same we can perform operation for last elements








    }
}
