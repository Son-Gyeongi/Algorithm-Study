import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int x=i;x<=j;x++) {
            String str = String.valueOf(x);
            String[] strArr = str.split("");
            
            for (int y=0;y<strArr.length;y++) {
                if (strArr[y].equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}