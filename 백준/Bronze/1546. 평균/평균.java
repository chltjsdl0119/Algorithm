import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        long max = 0;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            sum += arr[i];
        }

        System.out.println((sum * 100.0) / (max * N));
    }
}