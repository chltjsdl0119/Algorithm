import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            Stack<Integer> stack = new Stack<>();

            int N = Integer.parseInt(reader.readLine());

            String[] command;

            for (int i = 0; i < N; i++) {
                command = reader.readLine().split(" ");

                switch (command[0]) {
                    case "1": {
                        int X = Integer.parseInt(command[1]);
                        stack.push(X);

                    } break;
                    case "2": {
                        System.out.println(stack.isEmpty() ? -1 : stack.pop());

                    } break;
                    case "3": {
                        System.out.println(stack.size());

                    } break;
                    case "4": {
                        System.out.println(stack.empty() ? 1 : 0);

                    } break;
                    case "5": {
                        System.out.println(stack.empty() ? -1 : stack.peek());

                    } break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + command[0]);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}