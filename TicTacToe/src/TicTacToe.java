import java.util.Scanner;
public class TicTacToe {
    private static final int BOARD_SIZE = 3;
    private static char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
    private static char currentPlayer = 'X';
    private static boolean gameOver = false;

    public static void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard() {
        System.out.println("   1  2  3  ");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static boolean isMoveValid(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == ' ';
    }

    public static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    public static boolean checkWin(char currentPlayer) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    public static void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] alphaBetaSearch() {
        int[] result = alphaBetaMax(Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{result[1], result[2]};
    }

    public static int[] alphaBetaMax(int alpha, int beta) {
        int[] result = new int[3];
        if (checkWin('X')) {
            result[0] = 1;
            return result;
        } else if (checkWin('O')) {
            result[0] = -1;
            return result;
        } else if (isBoardFull()) {
            result[0] = 0;
            return result;
        }
        result[0] = Integer.MIN_VALUE;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = 'X';
                    int[] temp = alphaBetaMin(alpha, beta);
                    if (temp[0] > result[0]) {
                        result[0] = temp[0];
                        result[1] = i;
                        result[2] = j;
                    }
                    board[i][j] = ' ';
                    if (result[0] >= beta) {
                        return result;
                    }
                    alpha = Math.max(alpha, result[0]);
                }
            }
        }
        return result;
    }

    public static int[] alphaBetaMin(int alpha, int beta) {
        int[] result = new int[3];
        if (checkWin('X')) {
            result[0] = 1;
            return result;
        } else if (checkWin('O')) {
            result[0] = -1;
            return result;
        } else if (isBoardFull()) {
            result[0] = 0;
            return result;
        }
        result[0] = Integer.MAX_VALUE;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = 'O';
                    int[] temp = alphaBetaMax(alpha, beta);
                    if (temp[0] < result[0]) {
                        result[0] = temp[0];
                        result[1] = i;
                        result[2] = j;
                    }
                    board[i][j] = ' ';
                    if (result[0] <= alpha) {
                        return result;
                    }
                    beta = Math.min(beta, result[0]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();
        char answer = ' ';
        System.out.println("Wanna play against the AI? (y/n)");
        while (answer != 'y' && answer != 'n') {
            answer = scanner.next().charAt(0);
            if (answer == 'y') {
                System.out.println("You are X, AI is O.");
            } else if (answer == 'n') {
                System.out.println("P1 is X, P2 is O.");
            } else {
                System.out.println("Invalid input!");
            }
        }
        if (answer == 'y') {
            printBoard();
            while (!gameOver) {
                if (currentPlayer == 'X') {
                    System.out.println("Player " + currentPlayer + ", enter row and column (e.g., 1 2): ");
                    int row = scanner.nextInt() - 1;
                    int col = scanner.nextInt() - 1;
                    if (isMoveValid(row, col)) {
                        makeMove(row, col);
                        if (checkWin(currentPlayer)) {
                            System.out.println("Player " + currentPlayer + " wins!");
                            gameOver = true;
                        } else if (isBoardFull()) {
                            System.out.println("It's a tie!");
                            gameOver = true;
                        }
                        changePlayer();
                    } else {
                        System.out.println("Invalid move!");
                    }
                } else {
                    System.out.println("Player " + currentPlayer + " is thinking...");
                    int[] result = alphaBetaSearch();
                    makeMove(result[0], result[1]);
                    printBoard();
                    if (checkWin(currentPlayer)) {
                        System.out.println("Player " + currentPlayer + " wins!");
                        gameOver = true;
                    } else if (isBoardFull()) {
                        System.out.println("It's a tie!");
                        gameOver = true;
                    }
                    changePlayer();
                }
            }
        } else {
            while (!gameOver) {
                printBoard();
                System.out.println("Player " + currentPlayer + ", enter row and column (e.g., 1 2): ");
                int row = scanner.nextInt() - 1; // Ajustamos para que sea compatible
                int col = scanner.nextInt() - 1;
                if (isMoveValid(row, col)) {
                    makeMove(row, col);
                    if (checkWin(currentPlayer)) {
                        printBoard();
                        System.out.println("Player " + currentPlayer + " wins");
                        gameOver = true;
                    } else if (isBoardFull()) {
                        printBoard();
                        System.out.println("Draw");
                        gameOver = true;
                    } else {
                        changePlayer();
                    }
                } else {
                    System.out.println("Invalid move");
                }
            }
        }
    }
}
