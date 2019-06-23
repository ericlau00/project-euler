public class Eric {
    private static WalletSolver myWallet;
    
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        solveTo(2);
        // System.out.println(new WalletSolver(30));
        System.out.println("time: " + (System.currentTimeMillis() - start) + " ms");
    }
    
    private static void solveTo(int max) {
        for(int i = 1; i <= max; i++) {
            System.out.println(i + " pence");
            myWallet = new WalletSolver(i);
            System.out.println(myWallet);
        }
    }
}