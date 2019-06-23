import java.util.ArrayList;

public class PermutationSolver {
    private ArrayList<Permutation> permutations;
    private int permutationCount;
    private Permutation permutation;
    private int[] circulation;
    private int nthPermutation;
    private static long start;
    
    public PermutationSolver(int max, int n) {
        nthPermutation = n;
        permutations = new ArrayList<>();
        permutation = new Permutation(max);
        circulation = new int[max+1];
        for(int i = 0; i< circulation.length; circulation[i] = i, i++) { }
        generatePermutations();
    }
    
    private void generatePermutations() {
        if(permutation.lastIsNg()) {}
        else if(permutation.accept()) { 
            permutations.add(new Permutation(permutation));
            if(permutations.size() == nthPermutation) {
                System.out.println(permutations.get(permutations.size() - 1));
                System.out.println("time " + (System.currentTimeMillis() - start) + " ms");
            }
        }
        else {
            for(int digit : circulation ) {
                permutation.populate(digit);
                generatePermutations();
                permutation.depopulate();
            }
        }
    }
    
    public String toString(){
        String rep = "permutations for " + "0 to " + circulation[circulation.length - 1] + System.lineSeparator();
        for(Permutation order : permutations) {
            rep += "\t" + order + System.lineSeparator();
        }
        return rep;
    }
    
    public static void main(String[] commandLine) {
        start = System.currentTimeMillis();
        System.out.println(new PermutationSolver(9,1000000));
    }
    
    
}

