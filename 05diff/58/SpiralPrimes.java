public class SpiralPrimes {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        double ratio = 1.00;
        double primes = 0;
        int layers = 2;
        for(;
            ratio > 0.1;
            layers++) {
                double total = (layers - 1) * 4 + 1;
                int[] corners = myCorners(layers);
                for(int corner: corners) {
                    if(isPrime(corner)) primes++;
                }
                ratio = primes / total;
            }
        System.out.println("dimensions " + ((layers - 1) * 2 - 1));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static int[] myCorners(int layers) {
        if (layers == 1) return new int[]{1,1,1,1};
        else {
            int dimensions = layers * 2 - 1;
            int start = myCorners(layers - 1)[3];
            int topRight = start + dimensions - 1;
            int topLeft = topRight + dimensions - 1;
            int lowLeft = topLeft + dimensions - 1;
            int lowRight = lowLeft + dimensions - 1;
            return new int[]{topRight, topLeft, lowLeft, lowRight};
        }
    }
    
    private static boolean isPrime(int n) {
        for(int i = 2; i < n / i + 1; i++) {
            if (n % i == 0) return false;
        }
        return true; 
    }
}