import java.util.ArrayList;
import java.math.BigInteger;

public class CombinatoricSelections {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(solve(100));
        System.out.println(System.currentTimeMillis() - start + " ms");
    }

    public static int solve(int limit) {
        int num_solutions = 0;
        for(int n = 1; n < limit + 1; n++) {
            for(int r = 0; r < n + 1; r++) {
                if(nCr(n,r).compareTo(BigInteger.valueOf(new Integer(1000000).intValue())) == 1)
                    num_solutions++;
            }
        }
        return num_solutions;
    }

    public static BigInteger nCr(int n, int r) {
        return permutation(n).divide(permutation(r).multiply(permutation( n - r )));
    }

    public static BigInteger permutation(int x) {
        if( x == 0 ) {
            return BigInteger.valueOf(new Integer(1).intValue());
        } else {
            BigInteger current = BigInteger.valueOf(new Integer(x).intValue());
            return current.multiply(permutation(x - 1));
        }
    }
}