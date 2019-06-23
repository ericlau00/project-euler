import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SudokuSolver {
    private SudokuBoard board;
    private int three_digit_number;
    public SudokuSolver(String text) {
        board = new SudokuBoard(text);
        System.out.println(board);
    }
    
}