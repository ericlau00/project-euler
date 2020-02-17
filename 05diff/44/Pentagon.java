public class Pentagon {
    public static void main(String[] commandLine) {
        int D = 0;
        for(int j = 1; ; j++) {
            for(int k = 1; ; k++) {
                if (pentagon(j) + pentagon(k))
                D = pentagon(k) - pentagon(j);
            }
        }
    }
    
    private static int pentagon(int n) {
        return n * ( 3 * n - 1) / 2; 
    }
}