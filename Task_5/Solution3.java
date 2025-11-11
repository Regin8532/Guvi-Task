package Task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//3. You are a teacher in school .In your class there are 10 students, you have decided to give special gifts to those students whose names start with "A" you are asked to separate those students with the help of a java program.
//Requirement:
//Use List interface to store the student name
//Use a lambda expression and the Stream API to filter the students
public class Solution3 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Aravind","Arun","Jeff","Aswini","Mike");
        String eligibleNames = names.stream()
                .filter(s->s.startsWith("A"))
                .collect(Collectors.joining(","));
        System.out.println("The students who get special gifts are "+eligibleNames);
    }
}
//Output:
//The students who get special gifts are Aravind,Arun,Aswini