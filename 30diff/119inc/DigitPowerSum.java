import java.util.ArrayList; 

public class DigitPowerSum{
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        boolean done = false; 
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int n = 10; !done; n++, done = a.size() == 30) { if (inSequence(n)) a.add(n); }
        System.out.println(a);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    
    private static boolean inSequence(int n) {
        int sum = sumDigits(n);
        if (sum == 1) return false; 
        for(int power = 1; Math.pow(sum, power) <= n; power++) { if (Math.pow(sum,power) == n) return true; }
        return false; 
    }
    
    private static int sumDigits(int n) {
        if ( n < 10 ) return n;
        else return sumDigits(n / 10) + sumDigits(n % 10);
    }
}