import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int[] arr = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (arr[0] == arr[1] && arr[0] == arr[2]) {
            answer = 10000 + (arr[0] * 1000);
        } else if (arr[0] == arr[1] || arr[0] == arr[2]) {
            answer = 1000 + (arr[0] * 100);
        } else if (arr[1] == arr[2]) {
            answer = 1000 + (arr[1] * 100);
        } else {
            answer = Math.max(Math.max(arr[0], arr[1]), arr[2]) * 100;
        }

        System.out.println(answer);
    }
}