import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<truck_weights.length;i++) {
            queue.offer(truck_weights[i]);
        }
        
        Queue<Integer> bridge = new LinkedList<>();
        int total = 0;
        while (!queue.isEmpty()) {
            answer++;
            int truck = queue.peek();
            if (total+truck <= weight) {
                queue.poll();
                bridge.offer(truck);
                total += truck;
            } else bridge.offer(0);
            
            if (bridge.size() >= bridge_length) {
                int completeTruck = bridge.poll();
                total -= completeTruck;
            }
        }
        
        return answer+bridge_length;
    }
}