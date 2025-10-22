import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        int[] arr = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(countSubSequence(M, arr));
    }

    private static int countSubSequence(int M, int[] arr) {
        int answer = 0;
        int sum = 0;
        int left = 0;

        for (int right : arr) {
            sum += right;

            if (sum == M)
                answer++;

            while (sum > M) {
                sum -= arr[left++];

                if (sum == M)
                    answer++;
            }
        }

        return answer;
    }
}
