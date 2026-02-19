class Solution {
    public int solution(int n) {
        int answer = 0;
        int reminder = 0;

        while (n > 0) {
            reminder = n % 3;
            n = n / 3;
            answer = answer * 3 + reminder;
        }
        return answer;
    }
}
