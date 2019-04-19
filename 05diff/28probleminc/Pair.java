public class Pair {
    private Layer layer;
    private int sum; 
    
    public Pair(Layer layer, int sum) {
        this.layer = layer;
        this.sum = sum;
    }
    
    public Layer getKey(){ return layer; }
    
    public int getValue(){ return sum; }
}