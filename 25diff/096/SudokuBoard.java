import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SudokuBoard {
    private int[][] board;
    private ArrayList<String> prefilled;
    private int ilastFilled;
    private int jlastFilled;
    
    public SudokuBoard(String text) {
        board = new int[9][9];
        prefilled = new ArrayList<>();
        jlastFilled -= 1;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                int digit = Integer.parseInt(text.substring(i * 9 + j, i * 9 + j + 1));
                board[i][j] = digit;
                if(digit != 0) prefilled.add(i + "," + j);
            }
        }
    }
    
    public boolean lastIsNg(){
        if (jlastFilled == -1) return false;
        return contradictSquare() || contradictHorizontal() || contradictVertical();
    }
    
    private boolean contradictSquare() {
        if (ilastFilled >= 0 && ilastFilled <= 2){
            if (jlastFilled >= 0 && jlastFilled <= 2) return checkSquare(1,1);
            else if (jlastFilled >= 3 && jlastFilled <= 5) return checkSquare(1,4);
            else return checkSquare(1,7);
        }
        else if (ilastFilled >= 3 && ilastFilled <= 5) {
            if (jlastFilled >= 0 && jlastFilled <= 2) return checkSquare(4,1);
            else if (jlastFilled >= 3 && jlastFilled <= 5) return checkSquare(4,4);
            else return checkSquare(4,7);
        } 
        else {
            if (jlastFilled >= 0 && jlastFilled <= 2) return checkSquare(7,1);
            else if (jlastFilled >= 3 && jlastFilled <= 5) return checkSquare(7,4);
            else return checkSquare(7,7);
        }
    }
    
    private boolean checkSquare(int i, int j) {
        int count = 0;
        int[] square = {board[i - 1][j - 1], board[i - 1][j], board[i -1][j + 1],
                        board[i][j - 1], board[i][j], board[i][j + 1],
                        board[i + 1][j - 1], board[i + 1][j], board[i + 1][j + 1]};
        for(int digit: square) {
            if(board[ilastFilled][jlastFilled] == digit) count++;
        }
        return count != 1;
    }
    
    private boolean contradictHorizontal() {
        int count = 0;
        for(int j = 0; j < board[ilastFilled].length; j++) {
            if(board[ilastFilled][jlastFilled] == board[ilastFilled][j]) count++;
        }
        return count != 1;
    }
    
    private boolean contradictVertical() {
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            if(board[ilastFilled][jlastFilled] == board[i][jlastFilled]) count++;
        }
        return count != 1;
    }
    
    public boolean accept() { return isFilled() && !lastIsNg(); }
    
    private boolean isFilled() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) return false; 
            }
        }
        return true;
    }
  
    public void populate(int digit) {
        increaseTile();
        while(prefilled.indexOf(ilastFilled + "," + jlastFilled) != -1) increaseTile();
        board[ilastFilled][jlastFilled] = digit;
    }
    
    private void increaseTile() {
        if(jlastFilled == 8) {
            if(ilastFilled != 8) {
                ilastFilled += 1;
                jlastFilled = 0;
            }
        }
        else jlastFilled += 1;
    }
    
    public void depopulate() {
        while(prefilled.indexOf(ilastFilled + "," + jlastFilled) != -1) decreaseTile();
        board[ilastFilled][jlastFilled] = 0;
        decreaseTile();
    }
    
    private void decreaseTile() {
        if(jlastFilled == 0) {
            jlastFilled = 8;
            ilastFilled -= 1;
        }
        else jlastFilled -= 1;        
    }
    
    public int getNumber() { return board[0][0] * 100 + board[0][1] * 10 + board[0][2]; }
    
    public String toString() {
        String rep = new String();
        for(int i = 0; i < board.length; rep += System.lineSeparator(), i++) {
            for(int j = 0; j < board[i].length; rep+= board[i][j], j++) {}
        }
        return rep;
    }
}