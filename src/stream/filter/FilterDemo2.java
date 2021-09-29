package stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

  public static void main(String[] args){

         // filter using two conditions
        List<String> names = new ArrayList<>();
        List<String> longNames = new ArrayList<>();
        names.add("Nasser");
        names.add("Muhamed");
        names.add("Omar");
        names.add("Malek");

        longNames = names.stream().filter(s -> s.length() > 6 &&  s.length() < 8).collect(Collectors.toList());
        System.out.println(longNames);
    }
}
