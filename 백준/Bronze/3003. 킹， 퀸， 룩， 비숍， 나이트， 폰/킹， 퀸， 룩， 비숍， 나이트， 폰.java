import java.util.Scanner;

public class Main {

    /**
     * 1. 총 16개의 피스. 1 1 2 2 2 8
     * input: 킹부터 차례대로, 현재의 흰색 피스 개수
     * output: 부족하거나 초과한 만큼의 개수를 조정하는 값 출력
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] standard = { 1, 1, 2, 2, 2, 8 };
        int[] input = new int[6];

        for (int i = 0; i < 6; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            int res = standard[i] - input[i];
            System.out.print(res + " ");
        }
    }
}