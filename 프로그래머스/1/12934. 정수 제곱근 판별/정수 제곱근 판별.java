class Solution {
  public long solution(long n) {
        long answer = 0;

        System.out.println(Math.sqrt(n));

        if (Math.sqrt(n) % 1 == 0) {
            answer = (long) Math.pow(Math.sqrt(n) + 1, 2);
        } else {
            answer = -1;
        }

        return answer;
    }
}