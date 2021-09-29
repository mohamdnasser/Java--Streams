package stream.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
    public static void main(String[] args){

        // multiply 10 using map
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> resultFromMap = numbers.stream().map(num -> num * 10 ).collect(Collectors.toList());
        System.out.println(resultFromMap);

        System.out.println("================================");

        // multiply 10 using Flat map
        List<Integer> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(5,6);
        List<Integer> list4 = Arrays.asList(7,8);

        List<List<Integer>> finalList = Arrays.asList(list1,list2,list3,list4);
        List<Integer> finalResult = finalList.stream().flatMap(n -> n.stream().map(num -> num * 10)).collect(Collectors.toList());
        System.out.println(finalResult);
    }
}
