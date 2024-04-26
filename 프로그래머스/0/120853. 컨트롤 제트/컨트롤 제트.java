import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] splitStr = s.split(" ");

        for(int i=0;i<splitStr.length;i++) {
            if (Objects.equals(splitStr[i], "Z"))
                splitStr[i] = String.valueOf(-Integer.parseInt(splitStr[i - 1]));
            answer += Integer.parseInt(splitStr[i]);
        }

        return answer;
    }
}