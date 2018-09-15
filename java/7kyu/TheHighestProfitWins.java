import java.util.stream.IntStream;

//  Problem: https://www.codewars.com/kata/559590633066759614000063
public class TheHighestProfitWins {

    public static int[] minMax(int[] arr) {
        return new int[] {IntStream.of(arr).min().getAsInt(), IntStream.of(arr).max().getAsInt()};
    }

}