class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) sb.append(c);
            else {
                if (Character.isLowerCase(c)) { // 소문자
                    int idx = (c - 'a' + n) % 26;
                    sb.append((char)(idx + 'a'));
                    // a
                } else { // 대문자 처리
                    int idx = (c - 'A' + n) % 26;
                    sb.append((char)(idx + 'A'));
                }
            }
        }
        return sb.toString();
    }
}