public class ReciprocalCycles {
    public static void main(String[] commandLine) {
        cycleLength(7);
    }
    
    private static void cycleLength(int d) {
        String cycle = Double.toString(1.0 / d);
        for(int i = 0; i < cycle.length(); i++) {
            System.out.println(cycle.substring(i,i+1));
        }
    }
    
}