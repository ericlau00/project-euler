public class NumberSpiralDiagonals {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        int layers = 1001 / 2 + 1 ;
        int sumDiagonals = diagonal(layers).getValue();
        System.out.println(sumDiagonals);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static Pair diagonal(int layers) {
        if (layers == 1) return new Pair(new Layer(1,1,1),1);
        else { 
            int dimensions = layers * 2 - 1;
            Layer previousLayer = diagonal(layers - 1).getKey();
            int currentSum = diagonal(layers - 1).getValue();
            int start = previousLayer.getEnd();
            int lowRight = start + dimensions - 1;
            int lowLeft = lowRight + dimensions - 1;
            int topLeft = lowLeft + dimensions - 1;
            int topRight = topLeft + dimensions - 1;
            currentSum += lowRight + lowLeft + topLeft + topRight;
            return new Pair(new Layer(start,topRight,layers), currentSum);
        }
    }
}