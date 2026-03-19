import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a + b + c != 180) {
            System.out.println("Error");
            return;
        }

        Set<Integer> angles = new HashSet<>();
        angles.add(a);
        angles.add(b);
        angles.add(c);

        switch (angles.size()) {
            case 1 -> System.out.println("Equilateral");
            case 2 -> System.out.println("Isosceles");
            case 3 -> System.out.println("Scalene");
            default -> System.out.println("Error");
        }
    }
}
