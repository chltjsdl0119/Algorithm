class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            boolean isExist = false;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                answer += i;
            }
        }
        
        return answer;
    }
}