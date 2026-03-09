import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        String[] numbers = reader.readLine().split(" ");

        int answer = 0;

        for (String number : numbers) {
            int num = Integer.parseInt(number);

            if (isPrime(num)) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
