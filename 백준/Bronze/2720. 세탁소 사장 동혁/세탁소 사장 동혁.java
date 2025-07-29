import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int T = Integer.parseInt(reader.readLine());
            int C = 0;

            List<Integer> answer = new ArrayList<>();

            for (int i = 0; i < T; i++) {
                C = Integer.parseInt(reader.readLine());

                while (C > 0) {
                    answer.add(C / 25);
                    C %= 25;

                    answer.add(C / 10);
                    C %= 10;

                    answer.add(C / 5);
                    C %= 5;

                    answer.add(C);
                    C %= 1;
                }
                for (Integer integer : answer) {
                    System.out.print(integer + " ");
                }
                System.out.println();

                answer.clear();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
