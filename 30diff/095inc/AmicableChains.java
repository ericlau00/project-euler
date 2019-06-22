import java.util.ArrayList;
public class AmicableChains {
    public static Answer longestChain = new Answer(false, new ArrayList<Integer>());
    public static Answer answer = new Answer(false, new ArrayList<Integer>());
    public static ArrayList<Integer> chainStarters = new ArrayList<Integer>();
    
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis(); 
        for(int i = 1; i < 1000000; answer = amicableChain(i), i++) {
            if (answer.getBoolean()) {
                chainStarters.add(answer.getChain().get(0));
                if(answer.length() > longestChain.length()) longestChain = answer;
            }
            System.out.println(answer);
        }
        System.out.println(longestChain);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    
    }
    
    private static Answer amicableChain(int n) {
        ArrayList<Integer> chain = new ArrayList<Integer>();
        for(int i = n; chain.indexOf(n) == chain.lastIndexOf(n);chain.add(i), i = sumDivisors(i)) {
            if (i >= 1000000 || (chain.size() > 1 && chainStarters.contains(chain.get(chain.size() - 1))))
                return new Answer(false, chain);
        }
        return new Answer(true,chain); 
    }
    
    private static int sumDivisors(int n) {
        int sum = 0;
        sum++;
        for(int i = 2; i < n / i + 1; i++) {
            if(n%i == 0){
                sum+=i;
                if ( n / i != i) sum += n / i;
            }
        }
        return sum;
    }
    private static ArrayList<Integer> toDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        divisors.add(1);
        for(int i = 2; i < n / i + 1; i++){
            if(n%i == 0) {
                divisors.add(i);
                if(n / i != i) divisors.add(n/i);
            }
        }
        return divisors;
    }
}