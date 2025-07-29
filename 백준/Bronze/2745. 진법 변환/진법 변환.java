import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] input = reader.readLine().split(" ");

            char[] N = input[0].toCharArray();
            int B = Integer.parseInt(input[1]);

            int answer = 0;

            for (int i = 0; i < N.length; i++) {
                char c = N[i];

                int value = (c >= '0' && c <= '9') ? c - '0' : c - 'A' + 10;

                answer += (int) (Math.pow(B, N.length - i - 1) * value);
            }

            System.out.println(answer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
