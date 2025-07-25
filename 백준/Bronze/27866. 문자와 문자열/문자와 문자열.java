import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String S = reader.readLine();
            int i = Integer.parseInt(reader.readLine());

            System.out.println(S.toCharArray()[i - 1]);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
