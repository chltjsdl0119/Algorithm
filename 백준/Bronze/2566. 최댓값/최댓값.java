import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        int N = 9, M = 9;

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            tokenizer = new StringTokenizer(reader.readLine());

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        int x = 0, y = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
