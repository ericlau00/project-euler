/*
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit 
numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 
3-digit numbers.
*/
public class Palindrome {
    public static void main(String[] commandLine) {
        for(int one = 999; one > 0; one--){
            for (int two = 999; two > 0; two--) {
                if(isPalindrome(one * two)) {
                    int product = one * two;
                    System.out.println(product);
                }
            }
        }
    }
    public static boolean isPalindrome(int product) {
        int ones = product % 10;
        product /= 10;
        int tens = product % 10;
        product /= 10;
        int hunds = product % 10;
        product /= 10;
        int thou = product % 10;
        product /= 10;
        int tthou = product % 10;
        product /= 10;
        int hthou = product % 10;
        return hthou == 9 && hthou == ones && tthou == tens && thou == hunds;
    }
}