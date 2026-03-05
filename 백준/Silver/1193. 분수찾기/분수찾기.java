import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(reader.readLine());
        int N = 1;
        int sum = 1;

        while(N < X) {
            sum++;
            N += sum;
        }

        int prevSum = N - sum;
        int offset = X - prevSum;

        if(sum % 2 == 0) {
            System.out.println(offset + "/" + (sum - offset + 1));
        } else {
            System.out.println((sum - offset + 1) + "/" + offset);
        }
    }
}