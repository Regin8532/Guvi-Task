package Task_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//2. Write a program to check whether the Strings in the List are empty or not and print the list having non-empty strings. If the given List is: Liststrings Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
public class Solution2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        String nomEmptyStrings = words.stream()
                .filter(s->!s.isEmpty())
                .collect(Collectors.joining(","));
        System.out.println(nomEmptyStrings);
    }
}
//Output:
//abc,bc,efg,abcd,jkl