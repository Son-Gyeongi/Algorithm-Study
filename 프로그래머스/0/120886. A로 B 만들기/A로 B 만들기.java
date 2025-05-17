import java.util.*;

class Solution {
    public int solution(String before, String after) {
        Map<String, Integer> bMap = new HashMap<>();
        Map<String, Integer> aMap = new HashMap<>();
        
        for (int i=0;i<before.length();i++) {
            int value1 = bMap.getOrDefault(""+before.charAt(i),0);
            bMap.put(""+before.charAt(i), value1+1);
            
            int value2 = aMap.getOrDefault(""+after.charAt(i),0);
            aMap.put(""+after.charAt(i), value2+1);
        }
        
        int count = 0;
        for (String key : bMap.keySet()) {
            if (bMap.get(key) == aMap.get(key)) count++;
        }
        
        if (count == bMap.size()) return 1;

        return 0;
    }
}