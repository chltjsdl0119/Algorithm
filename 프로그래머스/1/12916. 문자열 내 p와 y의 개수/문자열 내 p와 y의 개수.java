class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P' || s.charAt(i) == 'p') {
                pCount++;
            }

            if (s.charAt(i) == 'Y' || s.charAt(i) == 'y') {
                yCount++;
            }
        }

        answer = pCount == yCount;

        return answer;
    }
}