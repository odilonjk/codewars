import java.util.stream.IntStream;

//  Problem: https://www.codewars.com/kata/5949481f86420f59480000e7
public class OddOrEven {

    public static String oddOrEven (int[] array) {
        return IntStream.of(array).sum() % 2 == 0 ? "even" : "odd";
    }

}