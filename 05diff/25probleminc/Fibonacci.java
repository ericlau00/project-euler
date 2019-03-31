public class Fibonacci {
    public static void main(String[] commandLine) {
        int place = 1;
        for(; !digitCount(toFib(place),4);place++){ }
        System.out.println(place);
    }
    public static int toFib(int index) {
        if (index == 1 || index == 2) return 1;
        return toFib(index - 2) + toFib(index - 1);
    }
    public static boolean digitCount(int num, int digits) {
        return Integer.toString(num).length() == digits;
    }
}