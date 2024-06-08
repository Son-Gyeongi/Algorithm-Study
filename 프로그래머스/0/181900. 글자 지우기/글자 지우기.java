import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] strArr = my_string.split("");
        Arrays.sort(indices);
        
        int j = 0;
        for (int i=0;i<strArr.length;i++) {
            if (i != indices[j]) {
                answer += strArr[i];
            } else {
                j++;
            }
            
            if (j == indices.length) j = indices.length -1;
        }
        
        return answer;
    }
}