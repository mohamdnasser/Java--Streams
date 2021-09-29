package stream.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args){
        List<String> cars = Arrays.asList("fiat" , "mg" , "mini copper", "bmw");
        cars.stream().map(s -> s.length()).forEach(System.out::println);
    }
}
