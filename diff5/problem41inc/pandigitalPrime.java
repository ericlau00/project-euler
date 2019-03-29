public class pandigitalPrime{
    public static void main(String[] commandLine){
        long largest = 0;
        for(long i = 9600001; i > 0; i -= 2) {
            if (isPrime(i) && isPandigital(i)) {
                largest = i;
                break;
            }
        }
        System.out.println(largest);
    }
    public static boolean isPrime(long number){
        for(long i = 2; i < number / i + 1; i++)
            if (number % i == 0) return false;
        return true;
    }
    public static boolean isPandigital(long number) {
        String ref = new String();
        String num = Long.toString(number);
        if (num.indexOf("0") != -1) return false;
        for(int digit = 1; digit <= Long.toString(number).length(); digit++) {
            ref += Integer.toString(digit);
            ref = ref.replaceFirst(Integer.toString(digit), "");
            num = num.replaceFirst(Integer.toString(digit), "");
        }
        return ref.equals(num);   
    }
}