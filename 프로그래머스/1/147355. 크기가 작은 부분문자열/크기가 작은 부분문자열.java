import java.util.*;

class Solution {
    public long solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        
        for (int i=0;i<=t.length()-(p.length());i++) {
            String subt = t.substring(i, pLen);
            
            if (Long.parseLong(subt) <= Long.parseLong(p)) answer++;
            
            pLen++;
        }
        
        return answer;
    }
}