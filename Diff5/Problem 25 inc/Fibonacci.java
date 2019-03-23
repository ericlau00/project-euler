public class Fibonacci {
    public static void main(String[] commandLine) {
        boolean hasThree = false;
        int place = 1;
        for(int i=1; !hasThree;i++){
            hasThree = digitCount(toFib(i),1000);
            place++;
        }
        System.out.println(place);
    }
    public static int toFib(int index) {
        if (index == 1) return 1;
        if (index == 2) return 1;
        else return toFib(index - 2) + toFib(index - 1);
    }
    public static boolean digitCount(int num, int digits) {
        return num / Math.pow(10, digits - 1) >= 1;
    }
}