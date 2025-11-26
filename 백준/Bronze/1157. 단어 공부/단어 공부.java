import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : line.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        char answer = '?';
        boolean duplicate = false;

        for (var entry : map.entrySet()) {
            int count = entry.getValue();
            char ch = entry.getKey();

            if (count > max) {
                max = count;
                answer = ch;
                duplicate = false;
            } else if (count == max) {
                duplicate = true;
            }
        }

        System.out.println(duplicate ? '?' : answer);
    }
}
