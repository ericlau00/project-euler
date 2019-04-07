import java.util.ArrayList;

public class Answer {
    private boolean isChain;
    private ArrayList<Integer> chain;
    private int length; 
    
    public Answer(boolean isChain, ArrayList<Integer> chain) {
        this.isChain = isChain;
        this.chain = chain; 
        length = chain.size();
    }
    
    public boolean getBoolean() { return isChain; }
        
    public ArrayList<Integer> getChain() { return chain; }
    
    public int length() { return length;}
    
    public String toString() {
        return Boolean.toString(isChain) + chain; 
    }
}