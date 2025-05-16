import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new HashSet<>();
        for (int i=0;i<my_string.length();i++) {
            set.add(""+my_string.charAt(i));
        }
        
        String answer = "";
        for (int i=0;i<my_string.length();i++) {
            if (set.contains(""+my_string.charAt(i))) {
                answer += my_string.charAt(i);
                set.remove(""+my_string.charAt(i));
            }
        }
        
        return answer;
    }
}