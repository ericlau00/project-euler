import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SudokuSolver {
    private SudokuBoard board;
    private int three_digit_number;
    private int[] circulation = {1,2,3,4,5,6,7,8,9};
    
    public SudokuSolver(String text) {
        board = new SudokuBoard(text);
        generateSolution();
        System.out.println(board);
    }
    
    private void generateSolution() {
        if(board.lastIsNg()) {}
        if(board.accept()) {}
        else {
            for(int i : circulation) {
                board.populate(i);
                generateSolution();
                // if(board.accept()) break;
                board.depopulate();
            }
        }
    }
    
    public int getTDN() { return three_digit_number; }
}