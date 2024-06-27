import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        Arrays.sort(arr);

        StringBuilder answerStr = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answerStr.append((char) arr[i]);
        }
        answer = Long.parseLong(answerStr.reverse().toString());

        return answer;
    }
}