class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {

            int count = 0;

            for (int j = 0; j < strlist[i].length(); j++) {

                count++;
            }

            answer[i] = count;
        }

        return answer;
    }
}