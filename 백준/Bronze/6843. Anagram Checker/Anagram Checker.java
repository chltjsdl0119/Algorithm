import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            String firstWord = sc.nextLine().replaceAll("[^A-Z]", "");
            String secondWord = sc.nextLine().replaceAll("[^A-Z]", "");

            Map<Character, Integer> firstWordMap = new HashMap<>();
            Map<Character, Integer> secondWordMap = new HashMap<>();

            for (char c : firstWord.toCharArray()) {
                firstWordMap.put(c, firstWordMap.getOrDefault(c, 0) + 1);
            }
            for (char c : secondWord.toCharArray()) {
                secondWordMap.put(c, secondWordMap.getOrDefault(c, 0) + 1);
            }

            String answer = "Is an anagram.";

            for (Character character : firstWordMap.keySet()) {
                if (!(Objects.equals(secondWordMap.get(character), firstWordMap.get(character)))) {
                    answer = "Is not an anagram.";
                }
            }

            System.out.println(answer);
        }
    }
}