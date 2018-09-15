//  Problem: https://www.codewars.com/kata/5541f58a944b85ce6d00006a
public class ProductOfConsecutiveFibNumbers {

    public static long[] productFib(long prod) {
    long count = 0;
        while (true) {
            long f1 = fib(count);
            long f2 = fib(count+1);
            if(f1 * f2 > prod) {
                return new long[] {f1, f2, 0};
            }
            if(f1 * f2 == prod) {
                return new long[] {f1, f2, 1};
            }
            count++; 
        }
    }

    private static long fib(long num) {
        if (num <= 1)
            return num;
        else
            return fibAux(0, 1, num);
    }

    private static long fibAux(long a, long b, long count) {
        if (count <= 1)
            return a;
        return fibAux(b, a+b, count-1); 
    }

}