
import java.math.BigInteger;
import java.util.Scanner;

/*
 * 
Find the number of different ways of ordering a list of n elements.
Input
An integer n for the number of elements to be ordered.
Output
An integer corresponding to the number of different ways the list can be ordered.

4 --> 24
*/
public class factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger f = calculateFactorial(n);
        System.out.println(f);
    }

    static BigInteger calculateFactorial(int n){
        if(n<0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        BigInteger result = BigInteger.ONE;
        for(int i=1;i<=n;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
