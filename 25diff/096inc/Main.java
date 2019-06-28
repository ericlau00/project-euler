import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        solution();
        System.out.println("time: " + (System.currentTimeMillis() - start) + " ms");
        
    }
    
    private static void solution() {
        String[] string_boards = new String[50];
        String string_board = new String();
        int current_board = -1;
        int total_sum = 0;
        File text = new File("p096_sudoku.txt");
        
        try {
            Scanner sc = new Scanner(text);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if(line.length() == 7) {
                    if(current_board != -1) string_boards[current_board] = string_board;
                    current_board++;
                    string_board = new String();
                }
                else string_board += line;
            }
            string_boards[current_board] = string_board;
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
                
        for(String board : string_boards) {total_sum += new SudokuSolver(board).getNumber();}
        
        System.out.println("total sum: " + total_sum);
        }
}