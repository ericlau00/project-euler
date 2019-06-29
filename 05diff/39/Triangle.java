import java.util.Arrays;

public class Triangle {
    private int[] sides;
    private int perimeter;
    private int filled;
    
    public Triangle(int perimeter) {
        sides = new int[3];
        this.perimeter = perimeter;
    }
    
    public Triangle(Triangle original) {
        this(original.perimeter);
        for(int i = 0 ; i < sides.length; sides[i] = original.sides[i], i++) {}
    }
    
    public boolean accept() {return is_right() && is_size(); }
    
    private boolean is_right() {
        int[] copy = sides.clone();
        Arrays.sort(copy);
        int s1 = copy[0];
        int s2 = copy[1];
        int hypotenuse = copy[2];
        return s1 * s1 + s2 * s2 == hypotenuse * hypotenuse;
    }
    
    private boolean is_size() { return perimeter == sum(); }
    
    private boolean in_size() { return perimeter > sum(); }
    
    public boolean lastIsNg() {
        if(filled == 3) return !is_right() || !is_size();
        return !in_size();
    }
    
    public void populate(int side) { sides[filled++] = side; }
    
    public void depopulate() { sides[--filled] = 0; }
    
    public boolean equals(Triangle other) {
        Arrays.sort(sides);
        Arrays.sort(other.sides);
        return Arrays.equals(sides, other.sides);    
    }
    
    public int sum() { return sides[0] + sides[1] + sides[2]; }
    
    public String toString() { return sides[0] + " " + sides[1] + " " + sides[2]; }
}