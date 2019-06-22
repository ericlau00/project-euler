import java.util.ArrayList;

public class Wallet {
    private ArrayList<Integer> coins;
    private int total;
    
    public Wallet(int total) {
        coins = new ArrayList<>();
        this.total = total;
    }
    
    public Wallet(Wallet wallet) {
        this.total = wallet.total;
        coins = new ArrayList<>();
        for(int coin: wallet.coins) { coins.add(coin); }
    }
    
    public boolean accept(){ return findSum() == total; }
    
    public boolean lastIsNg() { return findSum() > total; }
    
    private int findSum() {
        int sum = 0;
        for(int coin: coins) { sum += coin; }
        return sum;
    }
    
    public void populate(int pence){ coins.add(pence); }
    
    public void depopulate() { coins.remove(coins.size() - 1); }
    
    public ArrayList<Integer> getCoins() { return coins; }
    
    public String toString() {
        String rep = "\t"; 
        for(int coin: coins) {
            rep += coin + " ";
        }
        return rep;
    }
}