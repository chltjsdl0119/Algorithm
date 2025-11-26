import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = Integer.parseInt(scanner.next());
            int b = Integer.parseInt(scanner.next());
            int c = Integer.parseInt(scanner.next());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int[] arr = { a, b, c };
            Arrays.sort(arr);

            int x = arr[0];
            int y = arr[1];
            int z = arr[2];

            System.out.println(x * x + y * y == z * z ? "right" : "wrong");
        }
    }
}
