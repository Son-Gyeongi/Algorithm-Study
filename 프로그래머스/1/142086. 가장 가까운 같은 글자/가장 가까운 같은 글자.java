import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        // answer 각 요소들 -1로 초기화
        for (int i=0;i<answer.length;i++) {
            answer[i] = -1;
        }
        
        // s 문자열 배열로 나누기
        String[] sArr = s.split("");
        answer[0] = -1;
        
        // sArr 각 요소들 반복 그리고 각 요소들의 이전 인덱스들 반복
        for (int i=1;i<sArr.length;i++) {
            for (int j=0;j<i;j++) {
                if (sArr[i].equals(sArr[j])) {
                    answer[i] = i - j;
                }
            }
        }
        
        return answer;
    }
}