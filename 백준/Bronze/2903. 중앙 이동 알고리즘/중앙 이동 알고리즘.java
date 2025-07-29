import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int N = Integer.parseInt(reader.readLine());

            int answer = (int) Math.pow(Math.pow(2, N) + 1, 2);

            System.out.println(answer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
