public class Reversible {
    public static void main(String[] commandLine){
        long start = System.currentTimeMillis();
        long reversible = 0;
        for(long n = 1; n<1000; n++){
            if(isReversible(n)) reversible++;
        }
        System.out.println(reversible);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static boolean isReversible(long n) {
        String sum = Long.toString(n + reverse(n));
        for(int i = 0; i < sum.length(); i++) {
            int digit = Integer.parseInt(sum.substring(i,i+1));
            if (digit % 2 == 0) return false;
        }
        return true; 
    }
    
    private static long reverse(long n) {
    }
}