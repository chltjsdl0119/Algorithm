import java.util.*;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                list.add(sc.nextInt());
            }

            Set<Integer> set = new HashSet<>();

            for (Integer i : list) {
                set.add(i % 42);
            }

            System.out.println(set.size());
        }
    }
}