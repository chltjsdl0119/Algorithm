class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        int div = n / slice;
        int mod = n % slice;
        
        answer += div;
        
        if (mod != 0) {
            answer += 1;
        }
        
        return answer;
    }
}