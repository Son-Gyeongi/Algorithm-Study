class Solution {
    public int[] solution(int n) {
        int length = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[length];

        int j = 0;
        for (int i = 0; i < answer.length ; i++) {
            ++j;
            answer[i] = i + j;
        }

        return answer;
    }
}