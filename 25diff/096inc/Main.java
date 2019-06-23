import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static SudokuSolver[] boards;
    private static int current_board;
    private static String board; 

    public static void main(String[] commandLine) {
        boards = new SudokuSolver[50];
        current_board = -1;
        File text = new File("p096_sudoku.txt");
        try {
            Scanner sc = new Scanner(text);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if(line.length() == 7) {
                    if(current_board != -1) {
                        boards[current_board] = new SudokuSolver(board);
                    }
                    current_board++;
                    board = new String();
                }
                else {
                    board += line;
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }        
    }
}