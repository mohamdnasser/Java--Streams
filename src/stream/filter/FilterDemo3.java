package stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args){

        // removing null values from list
        List<String> words = Arrays.asList("Muhammed", null, "Nasser", null, "Malek", null);
        List<String> result = new ArrayList<>();

        result = words.stream().filter(s -> s != null).collect(Collectors.toList());
        System.out.println(result);
    }
}
