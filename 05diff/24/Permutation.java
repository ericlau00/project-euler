public class Permutation {
    private int[] digits; 
    private int filledDigits;
    
    public Permutation(int max) {
        digits = new int[max+1];
        for(int i = 0; i < digits.length; digits[i] = i, i++) {}
    }
    
    public Permutation(Permutation original) {
        digits = new int[original.digits.length];
        filledDigits = original.filledDigits;
        for(int i = 0; i < filledDigits; i++) {
            digits[i] = original.digits[i];
        }
    }
    
    public boolean lastIsNg() {
        for(int i = 0; i < filledDigits - 1; i++) {
            if (digits[filledDigits-1] == digits[i]) return true;
        }
        return false;
    }
    
    public boolean accept() {
        return filledDigits == digits.length;
    }
    
    public void populate(int digit) {
        digits[filledDigits++] = digit;
    }
    
    public void depopulate() {
        filledDigits--;
    }
    
    public int[] getDigits() {
        return digits;
    }
    
    public String toString() {
        String rep = new String();
        for(int digit : digits) {
            rep += digit;
        }
        return rep;
    }
}