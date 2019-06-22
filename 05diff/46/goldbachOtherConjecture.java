public class goldbachOtherConjecture{
    public static void main(String[] commandLine) {
        boolean condition = true;
        for(int i = 0; condition;++i) {
            if(isOddComposite(i))
                condition = canGoldbach(i);
            if (!condition) System.out.println(i);
        }
    }
    public static boolean isOddComposite(int number) {
        if (number % 2 == 1) {
            for(int i = 3; i < number / i + 1; i++) 
                if (number % i == 0) return true;
        }
        return false;   
    }
    public static boolean isPrime(int number) {
        for(int i = 2; i < number / i + 1; i++) 
            if (number % i == 0) return false;
        return true;
    }
    
    public static boolean canGoldbach(int number) {
        for(int prime = 2; prime < number; prime++) {
            if (isPrime(prime)) {
                for(int square = 1; prime + 2 * square * square <= number; square++)
                    if (number == prime + 2 * square * square) return true;
            }
        }
        return false; 
    }
}