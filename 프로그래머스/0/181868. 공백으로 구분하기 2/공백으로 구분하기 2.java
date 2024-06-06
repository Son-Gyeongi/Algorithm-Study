import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        String[] myStr = my_string.split(" ");
        
        for (String str : myStr) {
            if(!str.equals("")) {
                sb.append(str);
                sb.append(" ");
            }
        }
        
        // System.out.println(Arrays.toString(myStr)); // [, i, , , , love, , you]
        // System.out.println(sb.toString()); // i love you 
        
        String[] answer = sb.toString().split(" ");
        
        return answer;
    }
}