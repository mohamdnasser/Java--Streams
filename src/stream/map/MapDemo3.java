package stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> multipleNumbers = new ArrayList<>();

        multipleNumbers = numbers.stream().map(num -> num * 3).collect(Collectors.toList());
        System.out.println(multipleNumbers);
    }
}
