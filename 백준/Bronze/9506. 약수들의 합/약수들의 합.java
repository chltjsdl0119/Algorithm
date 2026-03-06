import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int N = Integer.parseInt(reader.readLine());

            if (N == -1) {
                break;
            }

            checkPerfectNumber(N);
        }
    }

    private static void checkPerfectNumber(int N) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N - 1; i++) {
            if (N % i == 0) {
                sum += i;
                list.add(i);
            }
        }

        if (sum != N) {
            System.out.println(N + " is NOT perfect.");
            return;
        }

        System.out.print(N + " = ");

        for (int i = 0; i < list.size(); i++) {
            if (i > 0) System.out.print(" + ");
            System.out.print(list.get(i));
        }

        System.out.println();
    }
}
