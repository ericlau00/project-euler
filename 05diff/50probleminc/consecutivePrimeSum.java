import java.util.ArrayList;

public class consecutivePrimeSum{
    public static void main(String[] commandLine){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i<100; i++) { if (isPrime(i)) primes.add(i); }
        
    }    
    public static boolean isPrime(int num) {
        for(int i = 2; i < num / i + 1; i++) { if (num % i == 0) return false; }
        return true;
    }
}