public class FactorialDigitSum {
    public static void main(String[] commandLine) {
        System.out.println(digitSum(factorial(100)));
    }
    public static long digitSum(long num) {
        if (num <= 10) {
            return num;
        }
        else {
            return digitSum(num % 10) + digitSum(num / 10);
        }
    }
    public static long factorial(int num) {
        long product = 1;
        for (int i = num; i > 1; i--) {
            product *= i;
            System.out.println(i +" , "+ product);
        }
        return product;
    }
}