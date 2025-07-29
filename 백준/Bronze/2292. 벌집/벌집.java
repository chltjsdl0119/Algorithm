import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int N = Integer.parseInt(reader.readLine());
            int num = 1;
            int count = 1;

            while (N > num) {
                num = num + (6 * count);
                count++;
            }

            System.out.println(count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
