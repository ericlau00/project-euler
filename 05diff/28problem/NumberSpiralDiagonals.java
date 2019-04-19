public class NumberSpiralDiagonals {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        long sum = 0;
        int layers = 1001 / 2 + 1; 
        for(int layer = 1; layer <= layers; layer++) {
            if (layer == 1) sum++;
            else {
                for(int corner: myCorners(layer)){sum += corner;}
            }
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static int[] myCorners(int layers) {
        if (layers == 1) return new int[]{1,1,1,1};
        else {
            int dimensions = layers * 2 - 1;
            int start = myCorners(layers - 1)[3];
            int lowRight = start + dimensions - 1;
            int lowLeft = lowRight + dimensions - 1;
            int topLeft = lowLeft + dimensions - 1;
            int topRight = topLeft + dimensions - 1;
            return new int[]{lowRight, lowLeft, topLeft, topRight};
        }
    }
}