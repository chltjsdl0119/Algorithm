import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long X = scanner.nextInt();  // 게임 횟수
        long Y = scanner.nextInt();  // 승리 횟수

        long Z = (Y * 100) / X;

        if (Z >= 99) {
            System.out.println(-1);
            return;
        }

        long left = 0;
        long right = X;
        long result = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long newWinRate = ((Y + mid) * 100) / (X + mid);

            if (newWinRate > Z) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }
}