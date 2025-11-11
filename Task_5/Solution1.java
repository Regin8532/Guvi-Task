package Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//1. Write a program using map() method, to convert a list of Strings into uppercase.If the given List is: Stream names Stream.of("abc", "d", "ef");
public class Solution1 {
    public static void main(String[] args) {
        String names = Stream.of("abc","d","ef")
                .map(s-> s.toUpperCase())
                        .collect(Collectors.joining(","));
        System.out.println(names);
    }
}
//Output:
//ABC,D,EF
