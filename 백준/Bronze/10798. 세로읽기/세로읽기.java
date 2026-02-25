import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[][] chars = new char[5][];
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            chars[i] = reader.readLine().toCharArray();
            maxLength = Math.max(maxLength, chars[i].length);
        }

        StringBuilder builder = new StringBuilder();

        for (int col = 0; col < maxLength; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < chars[row].length) {
                    builder.append(chars[row][col]);
                }
            }
        }

        System.out.println(builder.toString());
    }
}
