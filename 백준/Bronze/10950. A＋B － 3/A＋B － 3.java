import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int T = Integer.parseInt(reader.readLine());

            for (int i = 0; i < T; i++) {
                String[] input = reader.readLine().split(" ");

                System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
