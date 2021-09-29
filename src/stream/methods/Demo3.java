package stream.methods;

import java.util.HashSet;
import java.util.Set;

// anyMatch
// allMatch
// noneMatch
public class Demo3 {
    public static void main(String[] args){

        Set<String> fruits = new HashSet<>();
        fruits.add("one apple");
        fruits.add("two apple");
        fruits.add("one mango");
        fruits.add("two orange");

        boolean result;

        //anyMatch
        result = fruits.stream().anyMatch(s -> s.startsWith("one") );
        System.out.println(result);

        //allMatch
        result = fruits.stream().allMatch(s -> s.startsWith("one") );
        System.out.println(result);

        //noneMatch
        result = fruits.stream().noneMatch(s -> s.startsWith("three") );
        System.out.println(result);

    }
}
