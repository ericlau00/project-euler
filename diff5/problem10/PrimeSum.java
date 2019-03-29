public class PrimeSum {
    public static void main(String[] commandLine) {
        long sum = 0;
        for(int i = 2; i < 2000000; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int num) {
        for(int i = 2; i < num / i + 1; i++) {
            if( num % i == 0 )
                return false;
        }
        return true;
    }
}