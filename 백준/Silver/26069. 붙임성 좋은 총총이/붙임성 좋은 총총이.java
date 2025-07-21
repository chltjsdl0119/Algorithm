import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            Set<String> set = new HashSet<>();
            set.add("ChongChong");

            int N = Integer.parseInt(reader.readLine());

            List<String> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                list.add(reader.readLine());
            }

            for (String string : list) {
                String[] strArr = string.split(" ");

                String a = strArr[0];
                String b = strArr[1];

                // 둘 중 하나라도 이미 춤을 추고 있다면
                if (set.contains(a) || set.contains(b)) {
                    set.add(a);
                    set.add(b);
                }
            }

            System.out.println(set.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
