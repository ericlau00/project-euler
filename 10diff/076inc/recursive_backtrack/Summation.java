import java.util.ArrayList;

public class Summation{
    private ArrayList<Integer> list;
    private int sum;
    private int target;
    
    public Summation(int target) {
        list = new ArrayList<>();
        this.target = target;
    }
    
    public Summation(Summation original) {
        list = new ArrayList<>();
        for(int addend : original.list) list.add(addend);
        sum = original.sum;
        target = original.target;
    }
    
    public ArrayList<Integer> getList() { return list; }
    
    public boolean lastIsNg() { return sum > target; }
    
    public boolean accept() { return sum == target; }
    
    public void populate(int addend) {
        sum += addend;
        list.add(addend);
    }
    
    public void depopulate() { 
        sum -= list.remove(list.size() -1); 
    }
    
    public String toString() {
        String rep = new String();
        for(int addend : list) {
            rep += addend + " ";
        }
        return rep;
    }
}