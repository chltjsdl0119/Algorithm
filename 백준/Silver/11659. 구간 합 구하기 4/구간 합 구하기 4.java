import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in))) {

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int N = Integer.parseInt(tokenizer.nextToken());
            int M = Integer.parseInt(tokenizer.nextToken());

            int[] arr = new int[N + 1];

            tokenizer = new StringTokenizer(reader.readLine());

            for (int i = 1; i <= N; i++) {
                arr[i] = arr[i - 1] + Integer.parseInt(tokenizer.nextToken());
            }

            for (int q = 0; q < M; q++) {
                tokenizer = new StringTokenizer(reader.readLine());

                int i = Integer.parseInt(tokenizer.nextToken());
                int j = Integer.parseInt(tokenizer.nextToken());

                System.out.println(arr[j] - arr[i - 1]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}