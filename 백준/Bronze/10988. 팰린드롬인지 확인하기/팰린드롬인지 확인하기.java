import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int answer = validatePalindrome(sc.next());

        System.out.println(answer);
    }

    public static int validatePalindrome(String string) {
        String reverse = new StringBuilder(string).reverse().toString();

        if (string.equals(reverse)) {
            return 1;
        }

        return 0;
    }
}