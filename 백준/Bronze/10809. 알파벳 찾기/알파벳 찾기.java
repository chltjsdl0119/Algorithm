import java.util.*;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Map<Character, Integer> map = new HashMap<>();

            for (int i = 97; i < 123; i++) {
                map.put((char) i, -1);
            }

            String str = sc.next();
            char[] cArr = str.toCharArray();

            for (int i = 0; i <cArr.length; i++) {
                if (map.get(cArr[i]) == -1) {
                    map.put(cArr[i], i);
                }
            }

            for (Integer value : map.values()) {
                System.out.print(value + " ");
            }
        }
    }
}