import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static SudokuSolver[] boards;
    private static int current_board;
    private static String string_board; 

    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        solution();
        System.out.println("time: " + (System.currentTimeMillis() - start) + " ms");
        
    }
    
    private static void solution() {
        SudokuSolver[] boards;
        int current_board;
        String string_board;
        int total_sum;
        boards = new SudokuSolver[50];
        current_board = -1;
        File text = new File("p096_sudoku.txt");
        try {
            Scanner sc = new Scanner(text);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if(line.length() == 7) {
                    if(current_board != -1) boards[current_board] = new SudokuSolver(string_board);
                    current_board++;
                    string_board = new String();
                }
                else string_board += line;
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        for(SudokuSolver board : boards) { total_sum += board.getTDN(); }
        
        System.out.println("total sum: " + total_sum);
        }
}