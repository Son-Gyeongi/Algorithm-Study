import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr);
        String answer = "";
        for (int i=arr.length-1;i>=0;i--) {
            answer += arr[i];
        }
        return answer;
    }
}