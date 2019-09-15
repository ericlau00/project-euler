import java.util.ArrayList;

public class LatticeSolver {
    private ArrayList<LatticeGrid> solutions; 
    private LatticeGrid inProgress; 

    public LatticeSolver(int size) {
        solutions = new ArrayList<LatticeGrid>();
        inProgress = new LatticeGrid(size);
        generateSolutions();
    }

    public void generateSolutions() {
        if(inProgress.lastIsNG()) { }
        else if(inProgress.accept()) {
            solutions.add(new LatticeGrid(inProgress));
        }
        else {
            add(inProgress.getLatest(), new int[] {0,1});
            add(inProgress.getLatest(), new int[] {1,0});
        }
    }

    public void add(int[] latest, int[] increase) {
        inProgress.populate(new int[] {latest[0] + increase[0], latest[1] + increase[1]});
        generateSolutions();
        inProgress.depopulate();;
    }

    public String toString() {
        String result = new String();
        for(LatticeGrid grid : solutions) {
            result += grid + "\n";
        }
        return result;
    }

    public int numSolutions() { return solutions.size(); }

    public static void main(String[] args) {
        int size = 13;
        long start = System.currentTimeMillis();
        LatticeSolver solver = new LatticeSolver(size);
        System.out.println(solver.numSolutions() + " solutions in a size " + size + " grid");
        System.out.println(System.currentTimeMillis() - start + " ms");
    }
}