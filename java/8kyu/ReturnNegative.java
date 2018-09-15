//  Problem: https://www.codewars.com/kata/55685cd7ad70877c23000102
public class ReturnNegative {
    
    public static int makeNegative(final int x) {

        if(x == 0){
           return 0;
        } else if(x < 0){
            return x;
        }
        return (x-x)-x;

    }

}