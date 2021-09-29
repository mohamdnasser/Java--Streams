package stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args){

        List<String> vehicles = Arrays.asList("bus", "car", "bike", "train", "plane", "bus", "bike");

        // distinct() Not terminal method.
        // collect() terminal method.
        List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicles);
        System.out.println("=================================");

        // forEach() terminal method.
        vehicles.stream().distinct().forEach(value -> System.out.println(value) );
        System.out.println("=================================");

        // count() terminal method.
        long count = vehicles.stream().distinct().count();
        System.out.println(count);
        System.out.println("=================================");

        // limit() terminal method.
        List<String> limitedVehicles = vehicles.stream().limit(3).collect(Collectors.toList());
        System.out.println("limited Vehicles : " + limitedVehicles);
        System.out.println("=================================");

        // count() terminal method with filter .
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long countEvenNumbers = numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.println(countEvenNumbers);
        System.out.println("=================================");

        // reduce() terminal method
        List<String> letters = Arrays.asList("A","B","C","D");
        Optional<String> reduced = letters.stream().reduce((value, accomValue) -> {return  value + accomValue; });
        System.out.println(reduced.get());
        System.out.println("=================================");
   }
}
