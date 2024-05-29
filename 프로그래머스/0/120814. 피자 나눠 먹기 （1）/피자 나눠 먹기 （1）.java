class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int div = n / 7;
        int mod = n % 7;
        
        if (mod == 0) {
            answer += div;
        } else {
            answer += div;
            answer += 1;
        }
        
        return answer;
    }
}