import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Integer> solution(List<Integer> list1, List<Integer> list2) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < list1.size() && p2 < list2.size()) {
            if (list1.get(p1) < list2.get(p2)) {
                answer.add(list1.get(p1++));
            } else {
                answer.add(list2.get(p2++));
            }
        }

        while (p1 < list1.size()) {
            answer.add(list1.get(p1++));
        }
        while (p2 < list2.size()) {
            answer.add(list2.get(p2++));
        }

        return answer;
    }

    static List<Integer> createList(int n, String line) {
        String[] tokens = line.split(" ");

        List<Integer> list = new ArrayList<>(n);

        for (String token : tokens) {
            list.add(Integer.parseInt(token));
        }

        return list;
    }

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            List<Integer> list1 = createList(
                    Integer.parseInt(reader.readLine()),
                    reader.readLine()
            );

            List<Integer> list2 = createList(
                    Integer.parseInt(reader.readLine()),
                    reader.readLine()
            );

            solution(list1, list2).forEach(i -> System.out.print(i + " "));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
