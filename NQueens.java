public class NQueens {

    // This function prints the solution board
    public static void printSolution(int board[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // This function checks if a queen can be placed on board[row][col]
    public static boolean isSafe(int board[][], int row, int col, int N) {
        // Check this row on left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (int i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // This function solves the N-Queens problem using backtracking
    public static boolean solveNQueens(int board[][], int col, int N) {
        // Base case: If all queens are placed then return true
        if (col >= N) {
            return true;
        }

        // Try placing this queen in all rows one by one
        for (int i = 0; i < N; i++) {
            // Check if it's safe to place queen at board[i][col]
            if (isSafe(board, i, col, N)) {
                // Place this queen in board[i][col]
                board[i][col] = 1;

                // Recur to place the next queen
                if (solveNQueens(board, col + 1, N)) {
                    return true;
                }

                // If placing queen in board[i][col] doesn't lead to a solution, backtrack
                board[i][col] = 0;
            }
        }

        // If the queen cannot be placed in any row in this column col, return false
        return false;
    }

    public static void main(String[] args) {
        int N = 8; // You can change N to solve for different sizes
        int board[][] = new int[N][N];

        if (!solveNQueens(board, 0, N)) {
            System.out.println("Solution does not exist");
            return;
        }

        printSolution(board, N);
    }
}

