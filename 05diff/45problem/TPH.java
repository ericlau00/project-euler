import java.util.ArrayList;
public class TPH {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        ArrayList<Long> t = new ArrayList<Long>();
        ArrayList<Long> p = new ArrayList<Long>();
        ArrayList<Long> h = new ArrayList<Long>();
        boolean done = false; 
        for(long n = 1, occurances = 0; 
                !done; 
                t.add(triangle(n)), 
                p.add(pentagon(n)), 
                h.add(hexagon(n)),
                done = occurances == 3,
                n++) {
            if (t.size() > 0 && check(t,p,h)) occurances++;
            }
        System.out.println(t.get(t.size() - 2));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        
    }
    private static boolean check(ArrayList<Long> t, ArrayList<Long> p, ArrayList<Long> h) {
        return p.contains(t.get(t.size() - 1)) && h.contains(t.get(t.size() - 1));
    }
    
    private static long triangle(long n) { return n * (n + 1) / 2; }
    
    private static long pentagon(long n) { return n * ( 3 * n - 1 ) / 2; }
    
    private static long hexagon(long n) { return n * ( 2 * n - 1 ); }
}