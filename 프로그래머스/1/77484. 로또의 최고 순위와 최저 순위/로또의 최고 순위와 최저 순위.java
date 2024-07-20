import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        // 로또 번호 일치하는 값에 맞는 순위를 값에 넣기
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 1); // 6개 일치하면 1등
        map.put(5, 2); // 5개 일치하면 2등
        map.put(4, 3); // 4개 일치하면 3등
        map.put(3, 4); // 3개 일치하면 4등
        map.put(2, 5); // 2개 일치하면 5등
        map.put(1, 6); // 1개 일치하면 6등
        map.put(0, 6); // 0개 일치하면 6등
        
        // 1. 민우의 로또 lottos에서 0 을 List에 담기
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<lottos.length;i++) {
            if (lottos[i] == 0) list.add(0);
        }
        
        // 2. lottos와 겹치는 win_nums를 List에 담기
        for(int i=0;i<win_nums.length;i++) {
            if (lottos[i] == 0) continue;
            
            for (int j=0;j<win_nums.length;j++) {
                if (lottos[i] == win_nums[j]) list.add(lottos[i]);
            }
        }
        
        // 3. 
        // List의 사이즈를 계산 -> 최고 순위
        answer[0] = map.get(list.size());
        
        // List에서 0을 제외하고 세기 -> 최저 순위
        int sum = 0;
        for (int i=0;i<list.size();i++) {
            if (list.get(i) != 0) sum++;
        }
        answer[1] = map.get(sum);
        
        return answer;
    }
}