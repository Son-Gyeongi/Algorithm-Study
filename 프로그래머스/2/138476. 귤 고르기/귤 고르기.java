import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // 과일 개수 세기
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<tangerine.length;i++) {
            int value = map.getOrDefault(tangerine[i], 0);
            
            map.put(tangerine[i], value+1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        // value 값으로 내림차순 정렬
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        int sum = 0;
        for (Integer key : keySet) {
            int value = map.get(key);
            sum += value;
            answer++;
            
            if (sum >= k) return answer;
        }
        
        return answer;
    }
}