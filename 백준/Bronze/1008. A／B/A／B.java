import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();

        System.out.println(num1 / num2);
    }
}