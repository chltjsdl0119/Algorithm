import java.util.*;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            List<String> list = new ArrayList<>();

            int N = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < N; i++) {
                list.add(sc.nextLine());
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + 1 + ". " + list.get(i));
            }
        }
    }
}