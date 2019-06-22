public class Eric {
    private static WalletSolver myWallet;
    
    public static void main(String[] commandLine) {
        // solveTo(200);
        long start = System.currentTimeMillis();
        System.out.println(new WalletSolver(200));
        System.out.println("time: " + (System.currentTimeMillis() - start));
    }
    
    private static void solveTo(int max) {
        for(int i = 1; i <= max; i++) {
            System.out.println(i + " pence");
            myWallet = new WalletSolver(i);
            System.out.println(myWallet);
        }
    }
}