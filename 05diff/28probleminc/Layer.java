public class Layer {
    private int start;
    private int end; 
    private int layer; 
    
    public Layer(int start, int end, int layer) {
        this.start = start;
        this.end = end;
        this.layer = layer;
    }
    
    public int getStart() { return start; }

    public int getEnd() { return end; }
    
    public int getLayer() { return layer; }
}