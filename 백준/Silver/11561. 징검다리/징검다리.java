import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            long N = scanner.nextLong();
            System.out.println(findMaxK(N));
        }
    }

    static long findMaxK(long N) {
        long left = 1;
        long right = (long) Math.sqrt(2 * N); // 대략적인 upper bound 설정

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = mid * (mid + 1) / 2;

            if (sum <= N) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right; // 최종적으로 `right` 값이 최대 `k`
    }
}