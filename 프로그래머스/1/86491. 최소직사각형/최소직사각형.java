import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 1. sizes 요소 별 큰 값을 sizes[i][0] 에 작은 값을 sizes[i][1] 에 넣기
        for (int i=0;i<sizes.length;i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        // 2. sizes[i][0] 에서 큰 값 찾고 sizes[i][1] 에서 큰 값 찾기
        int firstIndexMax = sizes[0][0];
        int secondIndexMax = sizes[0][1];
        for (int i=1;i<sizes.length;i++) {
            firstIndexMax= Math.max(firstIndexMax, sizes[i][0]);
            secondIndexMax = Math.max(secondIndexMax, sizes[i][1]);
        }
        
        // 3. firstIndexMax * secondIndexMax 곱하기
        answer = firstIndexMax * secondIndexMax;
        
        return answer;
    }
}