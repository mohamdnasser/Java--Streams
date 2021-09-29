package stream.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,4,7,2,9,3,6,1);
        List<Integer> sortedList1 = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList1);
        List<Integer> sortedList2 = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList2);

        System.out.println("==========================================================");

        List<String> names = Arrays.asList("Muhammed", "Malek", "Omar", "Nasser", "Zika");
        List<String> sortedList3= names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList3);
        List<String> sortedList4 = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList4);
    }
}
