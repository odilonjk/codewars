//  Problem: https://www.codewars.com/kata/55d24f55d7dd296eb9000030
public class GrasshopperSummation {

    public static int summation(int n) {
        int count = 0;
        for(int x=0;x<=n;x++) {
            count += x;
        }      
        return count;
    }

}