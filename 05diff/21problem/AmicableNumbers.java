import java.util.ArrayList;

public class AmicableNumbers {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> amicable = new ArrayList<Integer>();
        for(int a = 1; a< 10000; a++) {
            int b = d(a);
            if (d(b) == a && a != b && !amicable.contains(a)) { 
                amicable.add(a);
                if (b < 10000 && !amicable.contains(b)) amicable.add(b);   
            }
        }
        int sum = 0;
        for (Integer i : amicable) {
            sum += i;
        }
        System.out.println(sum);
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        
    }
    private static int d(int n) {
        int sum = 1;
        for(int i = 2; i < n / i + 1; i++) {
            if (n % i == 0) {
                if( n / i != i) sum += n / i;
                sum += i;
            }
        }
        return sum; 
    }
}