import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Map<Integer, Integer>> queue = new LinkedList<>();
        PriorityQueue<Integer> sort = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<priorities.length;i++) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(i, priorities[i]);
            queue.offer(map);
            
            sort.offer(priorities[i]);
        }
        
        int max = sort.poll();
        while (max != 0) {
            Map<Integer, Integer> temp = queue.poll();
            
            for (Integer key : temp.keySet()) {
                int value = temp.get(key);
                
                if (max == value) {
                    max = sort.isEmpty() ? 0 : sort.poll();
                    answer++;
                    
                    if (key == location) {
                        max = 0;
                        break;
                    }
                } else queue.offer(temp);
            }
        }
        
        return answer;
    }
}