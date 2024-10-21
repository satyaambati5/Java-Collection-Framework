package org.satya;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
    public void streamExample(){

        Integer[] arr= {1,3,4,4,25,7,5,1};
        Stream<Integer> streamarray= Arrays.stream(arr).sorted((
                Integer a, Integer b)-> b-a
        );
//        List<Integer> data=arrayList( streamarray.forEach(val -> System.out.println(val+ " ")));
//        List<Integer>sortedlist=streamarray.collect(Collectors.toList());
        System.out.println(streamarray.toList());

        //Distinct values

        Stream<Integer> distinctarr= Arrays.stream(arr).distinct();
        System.out.println(distinctarr.toList());
    }
}

