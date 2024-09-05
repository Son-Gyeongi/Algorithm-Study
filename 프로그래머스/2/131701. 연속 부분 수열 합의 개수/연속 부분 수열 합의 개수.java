import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
        // Set 중복 없음, TreeSet 중복 없고 오름차순, 개수만 세는 거면 오름차순 필요없겠다.
        Set<Integer> set = new HashSet<>();
        
        // 1. elements 요소 다 더하기 및 길이가 1인 경우 set에 넣기
        int sum = 0;
        for (int i=0;i<elements.length;i++) {
            sum += elements[i];
            
            set.add(elements[i]);
        }
        
        // 2-1. 배열 모든 요소 더한 값 넣기
        set.add(sum);
        
        // 2-2. 길이가 2부터 길이가 배열의 사이즈만큼까지 연속 부분 수열 set에 넣기
        for (int i=0;i<elements.length;i++) {
            int fix = elements[i];
            
            int partSum = fix; // 요소 더하기
            int count = 2; // 길이 카운트
            int j = i+1; // 더해야할 요소
            while (count < elements.length) {
                if (j >= elements.length) {
                    j = j % elements.length;
                }
                
                partSum += elements[j];
                set.add(partSum);
                
                // 다음 요소를 위해서 +1
                count++;
                j++;
            }
        }
        
        return set.size();
    }
}