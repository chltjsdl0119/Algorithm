import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        try {
            int year = scanner.nextInt();

            if (year < 1000 || year > 3000) {
                throw new IOException("Year out of range");
            }

            System.out.println(year - 543);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}