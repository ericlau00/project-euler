import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SudokuBoard {
    private int[][] board;
    //last filled horizontal
    //last filled vertical 
    //prefilled tiles
    //total tiles filled
    //three digit number 
    
    public SudokuBoard(String text) {
        board = new int[9][9];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt(text.substring(i * 9 + j, i * 9 + j + 1));
                //count number and coordinates of prefilled tiles
            }
        }
    }
    
    public SudokuBoard(SudokuBoard original) {
        board = new int[9][9];
    }
    
    public boolean lastIsNg(){
        return contradictSquare() || contradictHorizontal() || contradictVertical();
    }
    
    private boolean contradictSquare() {
        return true;
    }
    
    private boolean contradictHorizontal() {
        return true;
    }
    
    private boolean contradictVertical() {
        return true; 
    }
    
    public boolean accept() {
        return isFilled() && !lastIsNg();
    }
    
    private boolean isFilled() {
        return true; 
    }
    
    public void populate(int number) {
    }
    
    public void depopulate() {
    }
    
    public String toString() {
        String rep = new String();
        for(int i = 0; i < board.length; rep += System.lineSeparator(), i++) {
            for(int j = 0; j < board[i].length; rep+= board[i][j], j++) {}
        }
        return rep;
    }
}