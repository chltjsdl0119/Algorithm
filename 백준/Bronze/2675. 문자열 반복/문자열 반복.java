import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int T = validateTestCaseCount(sc.nextInt());
            sc.nextLine();
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < T; i++) {

                String[] strArr = sc.nextLine().split(" ");

                int R = Integer.parseInt(strArr[0]);
                String str = strArr[1];

                char[] charArr = str.toCharArray();
                for (int j = 0; j < charArr.length; j++) {
                    for (int k = 0; k < R; k++) {
                        builder.append(charArr[j]);
                    }
                }

                System.out.println(builder.toString());
                builder.delete(0, builder.length());
            }
        }
    }

    public static int validateTestCaseCount(int T) {
        if (T < 1 || T > 1000) {
            throw new RuntimeException("테스트 케이스 개수 확인 바랍니다.");
        }

        return T;
    }
}