import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (i * j == n) answerList.add(i);
            }
        }

        // List를 int 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}