import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 1;
        int count = 0;
        
        for (int i=0;i<dots.length-1;i++) {
            // x축 길이
            for (int j=i+1;j<dots.length;j++) {
                if (dots[i][1] == dots[j][1] && count == 0) {
                    int max = Math.max(dots[i][0], dots[j][0]);
                    int min = Math.min(dots[i][0], dots[j][0]);
                    
                    answer *= (max - min);
                    count++;
                    break;
                }
            }
            
            // y축 길이
            for (int j=i+1;j<dots.length;j++) {
                if (dots[i][1] != dots[j][1] && count == 1) {
                    int max = Math.max(dots[i][1], dots[j][1]);
                    int min = Math.min(dots[i][1], dots[j][1]);
                    
                    answer *= (max - min);
                    count++;
                    break;
                }
            }
            
            if(count == 2) break;
        }
        
        return answer;
    }
}