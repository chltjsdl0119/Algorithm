import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // 숫자를 문자로 바꾸기
        String numberStr = String.valueOf(n);

        for (int i = 0; i < numberStr.length(); i++) {
            answer += Character.getNumericValue(numberStr.charAt(i));
        }

        return answer;
    }
}