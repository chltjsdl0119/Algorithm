import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;

                if (count == K) {
                    System.out.println(i);
                    return;
                }
            }
        }

        System.out.println(0);
    }
}
