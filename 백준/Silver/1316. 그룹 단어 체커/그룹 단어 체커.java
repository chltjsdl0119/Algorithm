import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        
        validateN(N);

        int count = 0;

        for (int i = 0; i < N; i++) {
            String string = reader.readLine();

            if (checkString(string)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void validateN(int N) {
        if (N > 100) {
            throw new IllegalArgumentException("N은 100보다 작거나 같아야 합니다.");
        }
    }

    public static boolean checkString(String string) {
        boolean[] used = new boolean[26];
        char prev = 0;

        for (char c : string.toCharArray()) {
            if (c != prev) {
                if (used[c - 'a']) {
                    return false;
                }

                used[c - 'a'] = true;
                prev = c;
            }
        }

        return true;
    }
}
