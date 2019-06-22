import java.util.ArrayList;

public class Collatz {
    public static void main(String[] commandLine) {
        int longest = 0;
        long start = System.currentTimeMillis();
        for(int i = 1; i < 1000000; i++) {
            if (toCollatz(i) > longest) longest = toCollatz(i);
        }
        System.out.println(longest);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static int toCollatz(int n) {
        int len = 1;
        for(; n != 1;) {
            if (n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            len++;
        }
        return len; 
    }
}