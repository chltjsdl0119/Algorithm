import java.util.*;

/**
 * 1. 명령의 수를 입력받는다.(1 <= N <= 10,000)
 * 2. 이후엔 명령이 하나씩 주어진다.
 *
 * 명령은 총 다섯 가지로 다음과 같다.
 * - push X: 정수 X를 큐에 넣는 연산.
 * - pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력.
 * - size: 큐에 들어 있는 정수의 개수를 출력.
 * - empty: 큐가 비어있으면 1, 아니면 0을 출력.
 * - front: 큐의 가장 앞에 있는 정수를 출력. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력.
 * - back: 큐의 가장 뒤에 있는 정수를 출력. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 1 || N > 10000) {
            return;
        }

        Queue queue = new Queue();

        for (int i = 0; i <= N; i++) {
            String[] c = sc.nextLine().split(" ");

            switch (c[0]) {
                case "push":
                    queue.push(Integer.parseInt(c[1]));
                    break;
                case "pop":
                    System.out.println(queue.pop());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.empty());
                    break;
                case "front":
                    System.out.println(queue.front());
                    break;
                case "back":
                    System.out.println(queue.back());
                    break;
            }
        }

    }

    static class Queue {

        private final Deque<Integer> queue;

        public Queue() {
            queue = new ArrayDeque<>();
        }

        public void push(int data) {
            queue.add(data);
        }

        public int pop() {
            return queue.isEmpty() ? -1 : queue.pop();
        }

        public int size() {
            return queue.size();
        }

        public int empty() {
            return queue.isEmpty() ? 1 : 0;
        }

        public int front() {
            return queue.isEmpty() ? -1 : queue.getFirst();
        }

        public int back() {
            return queue.isEmpty() ? -1 : queue.getLast();
        }
    }
}