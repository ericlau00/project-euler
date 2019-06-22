import java.util.ArrayList;
import java.util.Collections;

public class WalletSolver {
    private Wallet wallet; 
    private static int[] circulation = {1, 2, 5, 10, 20, 50, 100, 200};
    private int numSolutions;
    private ArrayList<Wallet> solutions;
    
    public WalletSolver(int total){
        wallet = new Wallet(total);
        solutions = new ArrayList<>();
        generateWays();
        numSolutions = solutions.size();
    }
    
    private void generateWays() {
        if(wallet.lastIsNg() || isDuplicate()) {
            // System.out.println("last is not good");
        }
        else if(wallet.accept()) { 
            // System.out.println("accept");
            System.out.println(wallet);
            solutions.add(new Wallet(wallet)); 
        }
        else {
            for(int coin: circulation) {
                wallet.populate(coin);
                // System.out.println("populate with " + coin + " : " + wallet);
                generateWays();
                wallet.depopulate();
            }
        }
    }
    
    private boolean isDuplicate() {
        Wallet copy = new Wallet(wallet);
        Collections.sort(copy.getCoins());
        for(Wallet solution : solutions) {
            if(copy.getCoins().equals(solution.getCoins())) return true;
        }
        return false;
    }
    
    public String toString() {
        String rep = numSolutions + " solutions" + System.lineSeparator();
        for(Wallet solution : solutions ) {
            rep += solution + System.lineSeparator();
        }
        return rep;
    }
    
}