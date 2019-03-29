/*
2520 is the smallest number that can be 
divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by 
all of the numbers from 1 to 20?
*/
public class SmallMultiple {
    public static void main(String[] commandLine) {
        boolean divisible = false;
        int j = 1;
        for(int i = 1; !divisible; i++) {
            divisible = isD(i, 1, 10);
            j++;
        }
        System.out.println(j);
        
    }
    public static boolean isD(int num, int low, int high) {
        for(int j = low; j <= high; j++){
            if(num % j != 0) {
                return false;
            }
        }
        return true;
    }
}