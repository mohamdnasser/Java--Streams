package stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny
//findFirst
public class Demo4 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Four", "two", "three", "two");

        Optional<String> name = names.stream().findAny();
        System.out.println(name.get());

        Optional<String> namesFirst = names.stream().findFirst();
        System.out.println(namesFirst.get());

    }
}
