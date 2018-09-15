import java.util.Arrays;
import java.util.stream.Collectors;

//  Problem: https://www.codewars.com/kata/57eae20f5500ad98e50002c5
public class RemoveStringSpaces {

    static String noSpace(final String x) {
        return Arrays.asList(x.split(" ")).stream().collect(Collectors.joining());
    }

}