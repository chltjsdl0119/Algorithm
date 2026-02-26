import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0;
        double totalCredit = 0.0;

        for (int i = 0; i < 20; i++) {
            String[] input = reader.readLine().split(" ");

            if (!input[2].equals("P")) {
                totalScore += Double.parseDouble(input[1]) * toPoint(input[2]);
                totalCredit += Double.parseDouble(input[1]);
            }
        }

        System.out.println(totalScore / totalCredit);
    }

    private static double toPoint(String grade) {
        return switch (grade) {
            case "A+" -> 4.5;
            case "A0" -> 4.0;
            case "B+" -> 3.5;
            case "B0" -> 3.0;
            case "C+" -> 2.5;
            case "C0" -> 2.0;
            case "D+" -> 1.5;
            case "D0" -> 1.0;
            case "F" -> 0.0;
            default -> throw new IllegalStateException("Unexpected value: " + grade);
        };
    }
}
