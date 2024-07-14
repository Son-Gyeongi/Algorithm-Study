import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[][] fruitBoxes = new int[score.length/m][m]; // score 배열에서 담을 수 있는 상자 수
        
        // 1. 일단 socre를 내림차순으로 만들기
        // 2. m 만큼 묶기
        // 3. 계산하기 ([묶은 것 중에 가장 작은 값fruitBoxes[i][2]]*[m])
        // 4. 4번에 계산한 것을 다 더하기
        
        // 1.
        // Arrays.sort(score, (a, b) -> b - a); 기본형 int[]에서 안됨
        // Arrays.sort(score, Collections.reverseOrder()); // 내림차순 정렬, 기본형 int[]에서 안됨
        score = Arrays.stream(score)
            .boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        
        
        // 2.
        int index = 0;
        for (int i=0;i<fruitBoxes.length;i++) {
            for (int j=0;j<fruitBoxes[i].length;j++) {
                fruitBoxes[i][j] = score[index];
                index++;
            }
        }
        
        // 3. 4.
        for (int i=0;i<fruitBoxes.length;i++) {
            answer += (fruitBoxes[i][fruitBoxes[i].length-1]*m);
        }
        
        return answer;
    }
}