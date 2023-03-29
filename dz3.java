import java.util.Arrays;

public class dz3 {
    public static void main(String[] args) {
        Integer[][] board = new Integer[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }

        Queens(board, 0);
        
    }

    private static void Queens(Integer[][] board, Integer n) {

        if ( n == board.length){
            show(board);
            System.out.println();
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isQueen(n, i, board)){
                board[n][i] = 1;
                Queens(board, n+1);
                board[n][i] = 0;
            }
        }

    }

    private static boolean isQueen(Integer n, int k, Integer[][] board) {
        
        for (int i = 0; i < n; i++)
        {
            if (board[i][k] == 1) {
                return false;
            }
        }
 
        for (int i = n, j = k; i >= 0 && j >= 0; i--, j--)
        {
            if (board[i][j] == 1) {
                return false;
            }
        }
 
        for (int i = n, j = k; i >= 0 && j < board.length; i--, j++)
        {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        return true;
    }

    private static void show(Integer[][] board) {
        for (Integer[] integers : board) {
            System.out.println(Arrays.toString(integers));
        }
    }
}
