import java.math.BigDecimal; 
import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        int lowLim = 1;
        int upLim = 4784;
        int index = (lowLim + upLim) / 2;
        for(; digitCount(toFib(index), 1000) != 0; index = (lowLim + upLim) / 2) {
            if(digitCount(toFib(index), 1000) < 0) lowLim = index;
            else upLim = index;
        }
        System.out.println(index + ": " + toFib(index));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        
    }
    public static BigInteger toFib(int index) {
        BigDecimal phi = new BigDecimal((1 + Math.sqrt(5)) / 2);
        BigDecimal psi = new BigDecimal((1 - Math.sqrt(5)) / 2);
        BigDecimal numerator = phi.pow(index).subtract(psi.pow(index));
        return (numerator.divide(new BigDecimal(Math.sqrt(5)))).toBigInteger();
    }
    public static int digitCount(BigInteger num, int digits) {
        return num.toString().length() - digits;
    }
}