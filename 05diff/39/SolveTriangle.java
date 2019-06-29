import java.util.ArrayList;

public class SolveTriangle {
    private Triangle triangle;
    private ArrayList<Triangle> solutions;
    private int perimeter;
    
    public SolveTriangle(int perimeter) {
        triangle = new Triangle(perimeter);
        solutions = new ArrayList<>();
        this.perimeter = perimeter;
        generateSolutions();
    }
    
    private void generateSolutions() {
        if(triangle.lastIsNg()) {}
        else if (triangle.accept() && !is_duplicate()) 
            solutions.add(new Triangle(triangle));
        else {
            for(int i = 1; i <= perimeter - triangle.sum(); i++) {
                triangle.populate(i);
                generateSolutions();
                triangle.depopulate();
            }
        }
    }
    
    private boolean is_duplicate() {
        for(Triangle solution : solutions) {
            if(triangle.equals(solution)) return true; 
        }
        return false;
    }
    
    public int num_solutions() { return solutions.size(); }
    
    public String toString() {
        String rep = "solutions for " + perimeter + System.lineSeparator();
        for(Triangle solution : solutions) {
            rep += "\t" + solution + System.lineSeparator();
        }
        return rep;
    }
}