import java.util.ArrayList;

public class DistinctPowers{
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        ArrayList<Double> terms = new ArrayList<Double>();
        addTerms(2,100,2,100,terms);
        System.out.println(terms.size());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    public static void addTerms(int a1, int a2, int b1, int b2,
                                ArrayList<Double> terms) {
        for(int a = a1; a <= a2; a++) {
            for(int b = b1; b <= b2; b++) {
                double term = Math.pow(a,b);
                if (!terms.contains(term)) terms.add(term);
            }
        }
    }
}