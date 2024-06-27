class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            num += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        if (x % num != 0) {
            answer = false;
        }

        return answer;
    }
}