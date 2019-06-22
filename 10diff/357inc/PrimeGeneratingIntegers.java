import java.util.ArrayList;
public class PrimeGeneratingIntegers {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        long sum = 0;
        for(int i = 1; i < 101; i++) {
            if (condition(i)) sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static boolean condition(int n) {
        for(int i : changeDivisors(getDivisors(n), n)) {
            if (!isPrime(i)) return false;
        }            
        return true; 
    }
    
    private static ArrayList<Integer> changeDivisors(ArrayList<Integer> divisors, int n) {
        ArrayList<Integer> change = new ArrayList<Integer>();
        for(int divisor : divisors) {
            change.add(divisor + n / divisor);
        }
        return change;
    }
    
    private static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        divisors.add(1);
        divisors.add(n);
        for(int i = 2; i < n / i + 1; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) divisors.add(n/i);
            }
        }
        return divisors;
    }

    private static boolean isPrime(int n) {
        for(int i = 2; i < n / i + 1; i++) {
            if (n % i == 0) return false;
        }
        return true; 
    }
}