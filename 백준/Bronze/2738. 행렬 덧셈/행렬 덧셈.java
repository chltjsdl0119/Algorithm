import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        for (int i = 0; i < N; i++) {
            tokenizer = new StringTokenizer(reader.readLine());

            for (int j = 0; j < M; j++) {
                arr1[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            tokenizer = new StringTokenizer(reader.readLine());

            for (int j = 0; j < M; j++) {
                arr2[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        int[][] answer = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
