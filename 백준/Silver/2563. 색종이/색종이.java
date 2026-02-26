import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int SIZE = 100;
    private static final int PAPER = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        boolean[][] board = new boolean[SIZE][SIZE];

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");

            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            for (int j = x; j < x + PAPER; j++) {
                for (int k = y; k < y + PAPER; k++) {
                    board[j][k] = true;
                }
            }
        }

        int area = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j]) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}
