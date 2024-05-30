class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            
            for (int j = 0; j < n; j++) {
                
                char c = my_string.charAt(i);

                answer.append(c);
            }
        }

        return answer.toString();
    }
}