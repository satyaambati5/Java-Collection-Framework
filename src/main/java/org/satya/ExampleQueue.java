package org.satya;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class ExampleQueue {
    public PriorityQueue<Integer> minPriorityQueueExample(){
//        System.out.println("this is the implementation of minPQueue which is from Collection Frame work extends from Queue Interface");

        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        minQ.add(1);
        minQ.add(5);
        minQ.add(5);
        minQ.add(8);
        minQ.add(7);

        minQ.forEach((Integer minqdata)-> System.out.println(minqdata) );

        //Remove elements using poll



        while (!minQ.isEmpty()){
           int val=  minQ.remove();
            System.out.println("Remove From Top: " + val);

        }

    return minQ;
    }


    public void  maxPriorityQueueExample(){
        PriorityQueue<Integer> maxQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        maxQ.add(1);
        maxQ.add(2);
        maxQ.add(3);
        maxQ.add(8);
        maxQ.add(7);

        maxQ.forEach((Integer maxqdata) -> System.out.println(maxqdata));

        


    }


    public void DqueueExample(){
        ArrayDeque<Integer> dQueue= new ArrayDeque<>();
        dQueue.push(1);
        dQueue.push(3);
        dQueue.push(2);
        dQueue.push(4);
        System.out.println(dQueue);
    }

}
