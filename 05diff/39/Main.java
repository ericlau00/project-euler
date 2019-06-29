public class Main {
    public static void main(String[] commandLine) {
        long start = System.currentTimeMillis();
        solution();
        System.out.println("time " + (System.currentTimeMillis() - start) + " ms");
    }
    
    private static void solution() {
        int max_solutions = 0;
        int max_perimeter = 0;
        for(int p = 3; p < 1001; p++) {
            SolveTriangle solution = new SolveTriangle(p);
            int num_solutions = solution.num_solutions();
            if (num_solutions > max_solutions) {
                System.out.println(solution);
                max_solutions = num_solutions;
                max_perimeter = p;
            }
        }
        System.out.println("number of solutions is maximised with " + max_perimeter);
    }
}