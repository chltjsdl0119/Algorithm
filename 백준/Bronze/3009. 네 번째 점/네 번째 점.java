import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            x ^= Integer.parseInt(tokenizer.nextToken());
            y ^= Integer.parseInt(tokenizer.nextToken());
        }

        System.out.println(x + " " + y);
    }
}
