class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 약수가 홀수개
            if (Math.pow((int) Math.sqrt(i), 2) == i) {
                answer -= i;
                continue;
            }
            answer += i;
        }

        return answer;
    }
}