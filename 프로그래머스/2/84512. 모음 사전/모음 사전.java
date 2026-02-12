class Solution {
    public int solution(String word) {

        /*
         * 5^4 + 5^3 + 5^2 + 5^1 + 1 = 781
         * 5^3 + 5^2 + 5^1 + 1 = 156
         * 5^2 + 5^1 + 1 = 31
         * 5^1 + 1 = 6
         * 1
         */
        int[] weight = {781, 156, 31, 6, 1};

        // 모음 순서
        String vowels = "AEIOU";

        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            int index = vowels.indexOf(word.charAt(i));

            answer += index * weight[i] + 1;
        }

        return answer;
    }
}
