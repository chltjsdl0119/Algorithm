import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] input = reader.readLine().split(" ");

            int N = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            int remain = 0;
            StringBuilder builder = new StringBuilder();

            while (N > 0) {
                remain = N % B;

                if (remain < 10) {
                    builder.append((char)(remain + '0'));
                } else {
                    builder.append((char)(remain - 10 + 'A'));
                }

                N /= B;
            }

            System.out.println(builder.reverse().toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
