import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        Set<String> set = new HashSet<>();
        set.add(words[0]);

        // ※ 이전 문자열과 연결 안되면 탈락, 똑같은 단어를 말하는 경우 탈락
        
        for (int i=1;i<words.length;i++) {
            String before = "" + words[i-1].charAt(words[i-1].length()-1);
            String after = "" + words[i].charAt(0);
            
            if (!before.equals(after) || set.contains(words[i])) {
                int number = i % n;
                int turn = i / n;
                
                return new int[] {number+1, turn +1};
            }
            
            set.add(words[i]);
        }

        return answer;
    }
}