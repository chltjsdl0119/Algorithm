import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(reader.readLine());
            String input = reader.readLine();

            for (int i = 0; i < n; i++) {
                String str = input.substring(0, 7).replace('#', '1').replace('*', '0');

                int number = Integer.parseInt(str, 2);

                System.out.print((char) number);

                input = input.substring(7);
            }

            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}