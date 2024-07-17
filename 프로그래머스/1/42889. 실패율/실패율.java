import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failureRate = new double[N];
        
        // 1. Map에 <각 스테이지 번호, 갯수> 담기
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=1;i<=N+1;i++) {
            map.put(i, 0);
        }
        
        for (int i=0;i<stages.length;i++) {
            int value = map.getOrDefault(stages[i], 0) + 1;
            map.put(stages[i], value);
        }
        
        // 2. 스테이지별로 - '스테이지에 남은 사람 / 스테이지 지나친 사람' 으로 실패율 저장하기
        int passed = stages.length; // 스테이지 지나친 사람
        for (int i=1;i<map.size();i++) {
            int stayed = map.getOrDefault(i, 0); // 스테이지에 남은 사람
            
            failureRate[i-1] = (double) stayed / passed;
            
            passed -= stayed;
            
            if (passed == 0) break;
        }
        
        // 3. 실패율 배열(failureRate) 내림차순 만들기
        double[] failureRateReverseOrder = Arrays.stream(failureRate)
            .boxed()
            .distinct() // 중복되는 값 제외
            .sorted(Collections.reverseOrder())
            .mapToDouble(Double::doubleValue)
            .toArray();
        
        // 4. answer 배열에 실패율에 따른 각 스테이지 저장하기
        int index = 0;
        for (int i=0;i<failureRateReverseOrder.length;i++) {
            for (int j=0;j<failureRate.length;j++) {
                if (failureRateReverseOrder[i] == failureRate[j]) {
                    answer[index++] = j+1;
                }
            }
        }
        
        return answer;
    }
}