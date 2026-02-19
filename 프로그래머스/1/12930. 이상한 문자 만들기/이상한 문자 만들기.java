class Solution {
    public String solution(String s) {
        char[] chars = new char[s.length()];
        int wordIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                chars[i] = ' ';
                wordIndex = 0;
            } else {
                if (wordIndex % 2 == 0) {
                    chars[i] = Character.toUpperCase(s.charAt(i));
                } else {
                    chars[i] = Character.toLowerCase(s.charAt(i));
                }
                wordIndex++;
            }
        }

        return new String(chars);
    }
}
