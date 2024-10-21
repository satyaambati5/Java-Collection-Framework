package org.satya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        arrayList myarr= new arrayList();
        myarr.vectorExample();
        System.out.println(myarr.stackExample());
//
//        List<Integer> mylist= myarr.listmethod1();
//        System.out.println(mylist);


//        Iterator<Integer> myitr= mylist.iterator();
//        while (myitr.hasNext()){
//            int val= myitr.next();
//
//            System.out.println("Loop val: "+val);
//        }
//    for(Integer data: mylist) {
//        System.out.println(data);
//    }

//    int len= mylist.size();
//        System.out.println("Size:"+len);
//    for(int i=0;i<len;i++){
//        int val= mylist.get(i);
//
//        if (val==3){
//            System.out.println("Value 3 is Found At Index " + mylist.indexOf(val)+ " and Removed:"+ mylist.remove(i));
//            len = mylist.size();
////            System.out.println("Size:"+len);
//            i--;
//        }
//
//        else {
//            System.out.println("At Index: " + i + " Value is: " + val);
//        } // Adjust the loop index because the list size has changed
//    }


        ExampleQueue queue = new ExampleQueue();
////    queue.minPriorityQueueExample();
//
//    queue.maxPriorityQueueExample();



        //DQueue Example
//        queue.DqueueExample();
//Stream Object

        StreamExample mystream= new StreamExample();
        mystream.streamExample();


    }

}