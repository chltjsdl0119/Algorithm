import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        String strA = String.valueOf(A);
        String strB = String.valueOf(B);

        System.out.println(A + B - C);
        System.out.println(Integer.parseInt(strA + strB) - C);
    }
}
