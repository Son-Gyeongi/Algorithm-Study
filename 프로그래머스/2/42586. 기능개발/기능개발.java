import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] addCount = new int[progresses.length];
        
        for (int i=0;i<progresses.length;i++) {
            int progress = progresses[i];
            
            int count = 0;
            for (int j=speeds[i];progress<100;) {
                progress += j;
                count++;
            }
            
            addCount[i] = count;
        }
        
        Stack<Integer> stack = new Stack<>();
        stack.push(addCount[0]);
        int count = 1; // 첫번째 기본값
        for (int i=1;i<addCount.length;i++) {
            
            // stack.peek() 시작 지점과 비교해야 한다.
            if (stack.peek() >= addCount[i]) {
                count++;
            } else {
                answer.add(count); // 한 번의 비교 작업이 끝난 후
                stack.clear();
                stack.push(addCount[i]);
                count = 1;
            }
        }
        answer.add(count);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}