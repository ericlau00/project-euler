import java.util.ArrayList;
public class SquareDigitChains {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        int one = 0;
        int eightynine = 0;
        for(int i = 1; i <10000001; i++) {
            if (createChain(i) == 1) one++;
            else eightynine++;
        }
        System.out.println(eightynine);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static int createChain(int n) {
        ArrayList<Integer> chain = new ArrayList<Integer>();
        chain.add(n);
        for(; n != 1 && n != 89;n = squareDigits(n), chain.add(n)){ }
        return chain.get(chain.size() - 1);
    }
    
    private static int squareDigits(int n) {
        if (n < 10) return n * n;
        else return squareDigits(n / 10) + squareDigits(n % 10);
    }
}