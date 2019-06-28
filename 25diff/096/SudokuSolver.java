import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Thread;

public class SudokuSolver {
    private SudokuBoard board;
    private boolean solutionGenerated;
    private int[] circulation = {1,2,3,4,5,6,7,8,9};
    
    public SudokuSolver(String text) {
        board = new SudokuBoard(text);
        generateSolution();
    }
    
    private void generateSolution() {
        if(board.lastIsNg()) { }
        else if(board.accept()) solutionGenerated = true;
        else {
            for(int digit : circulation) {
                if(!solutionGenerated) {
                    board.populate(digit);
                    generateSolution();
                    if(!solutionGenerated) board.depopulate();
                }
            }
        }
    }
    
    public int getNumber() { return board.getNumber(); }
    
    public String toString() { return board.toString();}
}