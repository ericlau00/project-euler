public class ComplexNumber{
    private int real;
    private int imaginary;
    private int distance;
    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    private ComplexNumber(int real, int imaginary, int distance) {
        this(real,imaginary);
        this.distance = distance;
    }
    
    public String toString() {
        return Integer.toString(real) + " + " + Integer.toString(imaginary) + "i";
    }
    
    public ComplexNumber square() {
        int a = real * real - imaginary * imaginary;
        int b = 2 * real * imaginary;
        int c = real * real + imaginary * imaginary;
        ComplexNumber square = new ComplexNumber(a, b, c);
        return square;
    }
    
    public int getReal() { return real; }
    
    public int getImaginary() { return imaginary; }
    
    public int getDistance() { return distance; }
}
