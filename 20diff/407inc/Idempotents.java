public class Idempotents {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        int sum = 0;
        for(int n = 1; n <= 10000000; sum += M(n), n++) {}
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static int M(int n) {
        int max = 0;
        for(int a = 0, current = 0; a < n; current = a * a % 6, a++) {
            if (current > max) max = current; 
        }
        return max; 
    }
    
}