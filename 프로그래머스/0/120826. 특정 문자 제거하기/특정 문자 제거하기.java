class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();

        char a = letter.charAt(0);
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(c != a) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}