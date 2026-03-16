import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        if (N < 2) {
            return;
        }

        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
    }
}
