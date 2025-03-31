import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. 명령의 수를 입력받는다.(1 <= N <= 10,000)
 * 2. 이후엔 명령이 하나씩 주어진다.
 *
 * 명령은 총 다섯 가지로 다음과 같다.
 * - push X: 정수 X를 스택에 넣는 연산.
 * - pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력.
 * - size: 스택에 들어 있는 정수의 개수를 출력.
 * - empty: 스택이 비어있으면 1, 아니면 0을 출력.
 * - top: 스택의 가장 위에 있는 정수를 출력. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 1 || N > 10000) {
            return;
        }

        Stack stack = new Stack();

        for (int i = 0; i <= N; i++) {
            String[] c = sc.nextLine().split(" ");

            switch (c[0]) {
                case "push":
                    stack.push(Integer.parseInt(c[1]));
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
            }
        }

    }

    static class Stack {
        private final List<Integer> stack;

        public Stack() {
            this.stack = new ArrayList<>();
        }

        public void push(int data) {
            stack.add(data);
        }

        public int pop() {
            return stack.isEmpty() ? -1 : stack.remove(stack.size() - 1);
        }

        public int size() {
            return stack.size();
        }

        public int empty() {
            return stack.isEmpty() ? 1 : 0;
        }

        public int top() {
            return stack.isEmpty() ? -1 : stack.get(stack.size() - 1);
        }
    }
}