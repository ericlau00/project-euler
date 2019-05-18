public class Fibonacci {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        int index = 1;
        for(; !digitCount(toFib(index).toString(),1000); index++) {
            System.out.println(toFib(index));
        }
        System.out.println(index + ": " + toFib(index));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        
    }
    public static Double toFib(int index) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        return (Math.pow(phi,index) - Math.pow(psi,index)) / Math.sqrt(5);
    }
    public static boolean digitCount(String num, int digits) {
        int mydigits; 
        int indexOfE = num.indexOf("E");
        int indexOfDecimal = num.indexOf(".");
        if(indexOfE > -1) 
            mydigits = Integer.parseInt(num.substring(indexOfE+1)) + 1;
        else 
            mydigits = indexOfDecimal;
        return mydigits == digits;
    }
}