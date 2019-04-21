import java.util.ArrayList;

public class CountingSummations {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        System.out.println(count(100));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    private static ArrayList<ArrayList<Integer>> count(int n) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        if (n == 1 || n == 2) {
            ArrayList<Integer> inner = new ArrayList<Integer>();
            inner.add(1);
            if ( n == 2 ) inner.add(1);
            outer.add(inner);
            return outer;
        }
        else {
        // fix overcounting because of unsorted inner lists
            for(int i = n-1; i > 1; i--) {
                ArrayList<Integer> inner = new ArrayList<Integer>();
                inner.add(i);
                inner.add(n-i);
                if(!outer.contains(inner)) outer.add(inner);
                for(ArrayList<Integer> inners : count(n-1)) {
                    inners.add(1);
                    if (!outer.contains(inners)) outer.add(inners);
                }
            }
            return outer;
        }
    }
}