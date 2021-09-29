package stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    public static void main(String[] args){
        // only Print Collection of Collections
        List<String> teamA = Arrays.asList("1","2","3");
        List<String> teamB = Arrays.asList("4","5","6");
        List<String> teamC = Arrays.asList("7","8","9");

        List<List<String>> allTeams = Arrays.asList(teamA,teamB,teamC);
        List<String> names = allTeams.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(names);
    }
}
