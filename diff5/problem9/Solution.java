public class Solution{
    public static void main(String[] commandLine) {
        boolean solve = false;
        for(int difference = 1; !solve; solve = forLoop(difference), difference++) { }
    }
    private static boolean forLoop(int difference) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int x = 2, y = 1; c < 1000 && a + b + c != 1000;) {
            ComplexNumber square = new ComplexNumber(x, y).square();
            a = square.getReal();
            b = square.getImaginary();
            c = square.getDistance();
            if (x - y > difference) { y++; }
            else { x++; }   
        }
        if (a + b + c == 1000) { 
            System.out.println(Integer.toString(a * b * c ));
            return true; 
        }
        return false; 
    }
}