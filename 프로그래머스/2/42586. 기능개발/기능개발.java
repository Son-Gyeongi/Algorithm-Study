import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] success = new int[progresses.length];
        
        for (int i=0;i<progresses.length;i++) {
            int temp = progresses[i];
            
            int count = 0;
            while (temp < 100) {
                count++;
                temp += speeds[i];
            }
            
            success[i] = count;
        }
        
        List<Integer> list = new ArrayList<>();
        int dayCount = 1;
        int standard = success[0];
        for (int i=1;i<success.length;i++) {
            if (standard < success[i]) {
                list.add(dayCount);
                dayCount = 1;
                standard = success[i];
            } else dayCount++;
        }
        list.add(dayCount);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}