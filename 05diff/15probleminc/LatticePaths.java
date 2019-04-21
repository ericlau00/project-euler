public class LatticePaths {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        System.out.println(paths(4));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static long paths(int dimensions) {
        if (dimensions == 1) return 2;
        else {
        //fix thinking 
/*             long total = 2;
            total += 2 * (dimensions - 2);
            for(int i = dimensions - 1; i > 0; i--) {
                total += paths(i) * 2;
            }
            return total;  */
        }
    }   
}