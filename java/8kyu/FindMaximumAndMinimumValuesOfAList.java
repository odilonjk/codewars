import java.util.Arrays;

//  Problem: https://www.codewars.com/kata/577a98a6ae28071780000989
public class FindMaximumAndMinimumValuesOfAList {

    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }
    
    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

}