import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // k는 명예의 전당 사람 수, score는 방송일 수
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        int index = 0;
        
        // 1. k 만큼 리스트에 넣기, 하지만 k가 score.length 보다 클 경우 score.length 길이만큼 리스트에 넣기
        int listLen = k < score.length ? k : score.length;
        for (int i=0;i<listLen;i++) {
            list.add(score[i]);
            
            // 2. 리스트 오름차순 정렬
            list.sort(Comparator.naturalOrder());

            // 3. answer에 최소 값 넣기
            answer[index++] = list.get(0);
        }
        
        for (int i=k;i<score.length;i++) {
            // 4. 리스트에 score[k] 부터 하나씩 넣고 2,3 반복
            list.add(score[i]);
            
            // 2. 리스트 오름차순 정렬
            list.sort(Comparator.naturalOrder());

            // 3. answer에 최소 값 넣기
            answer[index++] = list.get(list.size() - k);
        }
        
        return answer;
    }
}