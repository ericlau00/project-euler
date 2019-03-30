public class consecutivePrimeSum{
    public static void main(String[] commandLine){
        int curPrime = 2;
        boolean lessOneHund = true;
        for(int i = 3; curPrime < 100 && isPrime(curPrime); i++) {
            if(isPrime(i)) {
                curPrime += i;
            }
        }
        System.out.println(curPrime);
    }
    
    public static boolean isPrime(int num) {
        for(int i = 2; i < num / i + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}