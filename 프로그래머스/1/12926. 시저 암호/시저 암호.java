import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        String[] sArr = s.split("");

        String[] upperCase = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"
                ,"Q","R","S","T","U","V","W","X","Y","Z"};
        String[] lowerCase = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"
                ,"q","r","s","t","u","v","w","x","y","z"};

        for(int i=0;i<sArr.length;i++) {
            if(Objects.equals(sArr[i], " ")) {
                answer.append(sArr[i]);
                continue;
            }
            int idx;

            for (int j = 0; j < upperCase.length; j++) {
                if (Objects.equals(sArr[i], upperCase[j])) {
                    idx = j+n;
                    if(idx >= 26) idx -= 26;
                    answer.append(upperCase[idx]);
                } else if (Objects.equals(sArr[i], lowerCase[j])) {
                    idx = j+n;
                    if(idx >= 26) idx -= 26;
                    answer.append(lowerCase[idx]);
                }
            }
        }

        return answer.toString();
    }
}