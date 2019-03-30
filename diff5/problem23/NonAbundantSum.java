public class NonAbundantSum {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        int sum = 0; 
        for(int i = 1; i < 28124; i++) {
            if(!canBeWrittenAsSumOfTwoAbundantNumbers(i)) sum+=i;
        }
        System.out.println(sum);
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
    
    private static boolean canBeWrittenAsSumOfTwoAbundantNumbers(int number) {
        for(int i = 12; i < number - 11; i++) {
            if(isAbundant(i) && isAbundant(number - i)) return true;
        }
        return false;
    }
    private static boolean isAbundant(int number) {
        int sum = 1; 
        for(int i = 2; i < number / i + 1; i++) {
            if (number % i == 0) {
                sum += i;
                if (number / i != i) sum += number / i;
            }
        }
        return sum > number; 
    }
}