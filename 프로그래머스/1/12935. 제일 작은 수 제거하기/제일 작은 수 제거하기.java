import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (Integer num : arr) {
            if (num != min) {
                answer.add(num);
            }
        }

        if (arr.length == 1) {
            answer.add(-1);
        }
        
        return answer;
    }
}