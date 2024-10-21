package org.satya;

import java.util.Arrays;
import java.util.Optional;
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


        Stream<Integer> teststream= Arrays.stream(arr).filter(val-> val>3).map(val ->2*val);
        System.out.println("This is data after filter : "+ teststream.toList());

        Stream <Integer> minandmax = Arrays.stream(arr).distinct().sorted((Integer val1, Integer val2) -> val2-val1).skip(0);
//        Optional<Integer> minval= minandmax.min((Integer val1, Integer val2) -> val1-val2);
//        System.out.println("Second minimum value is : "+ minval);
        Optional<Integer> maxval= minandmax.min((Integer val1, Integer val2) -> val2-val1);
        System.out.println("Second maximum value is : "+maxval);


    }
}

