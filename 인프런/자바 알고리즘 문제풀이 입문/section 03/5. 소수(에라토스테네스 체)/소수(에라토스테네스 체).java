import java.util.Scanner;

public class Main {
    static int sieve(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n ; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n ; j += i) {
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(sieve(n));
    }
}
