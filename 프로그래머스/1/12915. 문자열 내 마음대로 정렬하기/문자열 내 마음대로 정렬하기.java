import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = Arrays.stream(strings)
                .sorted((s1, s2) -> s1.charAt(n) - s2.charAt(n))
                .toArray(String[]::new);
        
        return answer;
    }
}