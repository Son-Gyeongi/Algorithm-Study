import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        int idx = 0;
        int cal = 0;
        for (String q : quiz) {
            String[] qArr = q.split(" ");
            
            if (qArr[1].equals("-")) {
                cal = Integer.parseInt(qArr[0]) - Integer.parseInt(qArr[2]);
                
                if (cal == Integer.parseInt(qArr[4])) {
                    answer[idx] = "O";
                } else {
                    answer[idx] = "X";
                }
                idx++;
            } else {
                cal = Integer.parseInt(qArr[0]) + Integer.parseInt(qArr[2]);
                
                if (cal == Integer.parseInt(qArr[4])) {
                    answer[idx] = "O";
                } else {
                    answer[idx] = "X";
                }
                idx++;
            }
        }
        
        return answer;
    }
}