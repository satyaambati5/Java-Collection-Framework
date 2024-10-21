package org.satya;

import java.util.*;
import java.util.stream.Stream;

public class arrayList {
    public List<Integer>  listmethod1() {
        List<Integer> listval = new ArrayList<>();
        listval.add(1);
        listval.add(2);
        listval.add(3);
        listval.add(4);
        listval.add(5);
        System.out.println("checking the lambda expressing: ForEach Loop");

        listval.forEach((Integer val) ->
        {
            System.out.println("At Index: " + listval.indexOf(val) + " Value is: " + val);
        });

        return listval;
    }
    public Stream<Integer> vectorExample(){
        Vector<Integer> vectorlist = new Vector<>();
        vectorlist.add(0,1);
        vectorlist.add(1,4);
        vectorlist.add(0,7);
        vectorlist.add(7);
        System.out.println(vectorlist);
//        Iterator<Integer> viter = vectorlist.iterator();
//        while (viter.hasNext()){
//            int val = viter.next();
//            System.out.println(val);
//        }

//        for( int i=0; i<vectorlist.size();i++){
//            System.out.println(vectorlist.get(i));
//        }

        for(Integer data: vectorlist){
            System.out.println(data);
        }
        return vectorlist.stream().distinct();
    }


    public Stack<Integer> stackExample(){
        Stack<Integer> myStack = new Stack<>();
        myStack.addFirst(1);
        myStack.addFirst(3);
        myStack.addFirst(3);

        System.out.println(myStack);

        myStack.removeFirst();
        return  myStack;
    }
}
