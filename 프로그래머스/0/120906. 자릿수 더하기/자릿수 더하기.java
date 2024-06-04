class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = Integer.toString(n);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            answer += Integer.parseInt(String.valueOf(ch));
        }

        return answer;
    }
}