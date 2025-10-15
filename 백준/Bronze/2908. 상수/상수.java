import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int A = Integer.parseInt(new StringBuilder(tokenizer.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(tokenizer.nextToken()).reverse().toString());

        System.out.println(Math.max(A, B));
    }
}