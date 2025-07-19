import java.util.*;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int T = sc.nextInt();
            sc.nextLine();
            List<String> list = new ArrayList<>();

            for (int i = 0; i < T; i++) {
                list.add(sc.nextLine());
            }

            for (int i = 0; i < T; i++) {
                String[] input = list.get(i).split(" ");

                int H = Integer.parseInt(input[0]);
                int W = Integer.parseInt(input[1]);
                int N = Integer.parseInt(input[2]);

                int floor = N % H == 0 ? H : N % H;
                int room = (N - 1) / H + 1;

                System.out.printf("%d%02d%n", floor, room);
            }

        }
    }
}
