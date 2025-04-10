import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {

            String str = sc.nextLine();

            if (str.length() < 2 || str.length() > 50) {
                continue;
            }

            char[] chars = str.toCharArray();

            int count = 0;

            for (char c : chars) {
                if (c == '(') {
                    count++;
                } else {
                    count--;
                }

                if (count < 0) break;
            }

            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}