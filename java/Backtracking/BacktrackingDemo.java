package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingDemo {

    // 1. Generate Subsets (Combinations) - Choose -> Explore -> Unchoose
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrackSubsets(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // add copy of current subset
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]); // Choose
            backtrackSubsets(nums, i + 1, current, result); // Explore
            current.remove(current.size() - 1); // Unchoose
        }
    }

    // 2. N-Queens Solver - Find number of valid placements on NxN board
    private static int totalSolutions = 0;

    public static int totalNQueens(int n) {
        totalSolutions = 0;
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n]; // diagonals from top-left to bottom-right (row - col + n - 1)
        boolean[] diag2 = new boolean[2 * n]; // diagonals from top-right to bottom-left (row + col)
        solveNQueens(0, n, cols, diag1, diag2);
        return totalSolutions;
    }

    private static void solveNQueens(int row, int n, boolean[] cols, boolean[] diag1, boolean[] diag2) {
        if (row == n) {
            totalSolutions++;
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;

            // Pruning / Constraint propagation check
            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            // Choose
            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;

            // Explore
            solveNQueens(row + 1, n, cols, diag1, diag2);

            // Unchoose
            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Generating Subsets ---");
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = subsets(nums);
        System.out.println("Subsets of " + java.util.Arrays.toString(nums) + ":");
        System.out.println(allSubsets);

        System.out.println("\n--- 2. N-Queens Backtracking ---");
        int n = 4;
        int solutions = totalNQueens(n);
        System.out.println("Total solutions for " + n + "-Queens board: " + solutions); // 2
        
        n = 8;
        System.out.println("Total solutions for " + n + "-Queens board: " + totalNQueens(n)); // 92
    }
}
