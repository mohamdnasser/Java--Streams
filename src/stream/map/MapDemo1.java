package stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args){
        List<String> cars = Arrays.asList("fiat" , "mg" , "mini copper", "bmw");
        List<String> newCars = new ArrayList<>();

        newCars = cars.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(newCars);
    }
}
