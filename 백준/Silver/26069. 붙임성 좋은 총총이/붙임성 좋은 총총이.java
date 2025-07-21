import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            Set<String> set = new HashSet<>();
            set.add("ChongChong");

            int N = Integer.parseInt(reader.readLine());

            for (int i = 0; i < N; i++) {
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

                String str1 = tokenizer.nextToken();
                String str2 = tokenizer.nextToken();

                if (set.contains(str1) || set.contains(str2)) {
                    set.add(str1);
                    set.add(str2);
                }
            }

            System.out.println(set.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
