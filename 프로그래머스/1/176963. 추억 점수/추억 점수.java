import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // 이름, 그리움 점수
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0;i<name.length;i++) {
            map.put(name[i], yearning[i]);
        }
        
        
        for (int i=0;i<photo.length;i++) {
            int sum = 0;
            for (int j=0;j<photo[i].length;j++) {
                // map에 photo[i][j] 키가 존재하는지
                if (map.containsKey(photo[i][j]))
                    sum += map.get(photo[i][j]); // photo[i][j] 키의 값을 가져온다.
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
}