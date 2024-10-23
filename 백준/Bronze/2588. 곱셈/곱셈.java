import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        System.out.println(Integer.parseInt(A) * Integer.parseInt(B.substring(2)));
        System.out.println(Integer.parseInt(A) * Integer.parseInt(B.substring(1, 2)));
        System.out.println(Integer.parseInt(A) * Integer.parseInt(B.substring(0, 1)));
        System.out.println(Integer.parseInt(A) * Integer.parseInt(B));
    }
}