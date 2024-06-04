class Solution {
    public int solution(int n) {
        int answer = 0;

        int i = 1;

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += 1;
            }
        }
        
        return answer;
    }
}