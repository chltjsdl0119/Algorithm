import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N + 1];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(tokenizer.nextToken());
        }

        int M = Integer.parseInt(reader.readLine());

        for (int q = 0; q < M; q++) {
            tokenizer = new StringTokenizer(reader.readLine());

            int i = Integer.parseInt(tokenizer.nextToken());
            int j = Integer.parseInt(tokenizer.nextToken());

            System.out.println(arr[j] - arr[i - 1]);
        }
    }
}
