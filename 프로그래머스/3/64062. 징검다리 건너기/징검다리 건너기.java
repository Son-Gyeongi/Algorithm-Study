import java.util.*;

class Solution {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int min = 0;
        int max = 200_000_000;
        int mid;
        
        while(min <= max) {
            mid = (min+max) /2;
            if(check(stones, k, mid)) {
                answer = mid;
                min = mid +1;
            } else {
                max = mid -1;
            }
        }
        
        return answer;
    }
    
    public boolean check(int[] stones, int k, int mid) {
        int step=0;
        
        for (int i=0;i<stones.length;i++) {
            if(step >= k) break;
            
            if (stones[i] < mid) {
                step++;
                continue;
            }
            
            step = 0; // mid가 stones[i] 요소보다 작으면 다 건널 수 있음
        }
        
        return step < k;
    }
}