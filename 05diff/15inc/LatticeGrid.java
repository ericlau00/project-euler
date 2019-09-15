import java.util.ArrayList;

public class LatticeGrid {
    private ArrayList<int[]> path; 
    private int size;

    public LatticeGrid(int size) { 
        this.size = size; 
        path = new ArrayList<int[]>();
        this.populate(new int[] {0,0});
    }

    public LatticeGrid(LatticeGrid other) {
        this.size = other.size;
        path = new ArrayList<int[]>();
        for(int[] position : other.path) 
            this.path.add(position);
    }

    public boolean lastIsNG() {
        int[] latest = getLatest();
        return latest[0] > size || latest[1] > size;
    }

    public boolean accept() {
        int[] latest = getLatest();
        return latest[0] == size && latest[1] == size;  
    }

    public void populate(int[] position) { path.add(position); }

    public void depopulate() { path.remove(path.size() - 1); }

    public int[] getLatest() { return path.get(path.size() - 1); }

    public String toString() { 
        String result = new String();
        for(int[] position : path) {
            result += "[ " + position[0] + " , " + position[1] + " ] , "; 
        }
        return result;
    } 
}