import java.util.ArrayList;
import java.util.Collections;

public class SummationSolver {
    private ArrayList<Summation> summations;
    private Summation summing;
    private int[] circulation;
    
    public SummationSolver(int target) {
        summations = new ArrayList<>();
        summing = new Summation(target);
        circulation = new int[target-1];
        for(int i = 0; i < circulation.length; circulation[i] = i + 1, i++) {}
        generateSummations();
    }
    
    private void generateSummations() {
        if(summing.lastIsNg() || isDuplicate()) {}
        else if(summing.accept()) summations.add(new Summation(summing));
        else {
            for(int addend : circulation) {
                summing.populate(addend);
                generateSummations();
                summing.depopulate();
            }
        }
    }
    
    private boolean isDuplicate() {
        Summation copy = new Summation(summing);
        Collections.sort(copy.getList());
        for(Summation summation : summations) {
            if(copy.getList().equals(summation.getList())) return true;
        }
        return false;
    }
    
    public String toString() {
        String rep = summations.size() + " summations" + System.lineSeparator();
        for(Summation summation: summations) {
            rep += "\t" + summation + System.lineSeparator();
        }
        return rep;
    }
    
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        System.out.println(new SummationSolver(21));
        System.out.println("time " + (System.currentTimeMillis() - start) + " ms");
        
    }
}