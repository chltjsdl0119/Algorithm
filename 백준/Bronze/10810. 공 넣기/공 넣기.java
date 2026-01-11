import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());


        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        int[] basket = new int[N];

        for (int m = 0; m < M; m++) {
            tokenizer = new StringTokenizer(reader.readLine());

            int i = Integer.parseInt(tokenizer.nextToken());
            int j = Integer.parseInt(tokenizer.nextToken());
            int k = Integer.parseInt(tokenizer.nextToken());

            for (int index = i - 1; index <= j - 1; index++) {
                basket[index] = k;
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int i : basket) {
            builder.append(i).append(" ");
        }

        System.out.println(builder.toString().trim());
    }
}
