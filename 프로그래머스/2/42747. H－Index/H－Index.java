import java.util.*;

class Solution {
    public int solution(int[] citations) {
        if (citations.length == 1) return citations[0];
        
        int answer = 0;
        Arrays.sort(citations);
        int length = citations.length;
        for (int i=0;i<citations.length;i++) {
            int temp = length-i;
            
            if (temp <= citations[i]) return temp;
        }
        
        return answer;
    }
}