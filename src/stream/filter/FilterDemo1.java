package stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args){

        // filter using one condition
        List<Integer> list = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        // extract even numbers from the list
        // without using Streams
        for(Integer n : list){
            if(n % 2 == 0){
                System.out.println(n);
            }
        }

        // using Streams
        /*
            list.stream() >> convert list to Stream
            filter(n -> n % 2 == 0) >> filter the Streams based on condition using lambda expression
            collect(Collectors.toList()) >> Collect data from the Stream and put it into list
         */
        evenList =  list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

    }
}
