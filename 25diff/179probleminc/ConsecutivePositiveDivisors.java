import java.util.ArrayList;

public class ConsecutivePositiveDivisors {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        int consecutive = 0;
        for(int n = 2; n < 10000000; n++) {
            if(numDivisors(n) == numDivisors(n+1)) consecutive++;
        }
        System.out.println(consecutive);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static int numDivisors(int n) {
        int divisors = 0;
        for(int i = 1; i < n / i + 1; i++) {
            if(n % i == 0) {
                divisors++;
                if(n / i != i) divisors++;
            }
        }
        return divisors;
    }
}