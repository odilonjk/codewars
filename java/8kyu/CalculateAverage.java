import java.util.Arrays;

//  Problem: https://www.codewars.com/kata/57a2013acf1fa5bfc4000921
public class CalculateAverage {

    public static double findAverage(int[] array){
        return Arrays.stream(array).average().orElse(0);     
    }

}