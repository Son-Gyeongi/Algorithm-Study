import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        // 빵 - 1, 야채 - 2, 고기 - 3
        // 1-2-3-1 이 일심동체로 햄버거 한개

        if (ingredient.length < 4) return 0; // 13, 15, 16, 17 테스트 케이스

        Stack<Integer> stack = new Stack<>();
        
        // stack에 ingredient 담기
        for (int i : ingredient) {
            stack.push(i);
            
            // stack 사이즈가 4이상일 경우부터
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size-4) == 1
                   && stack.get(size-3) == 2
                   && stack.get(size-2) == 3
                   && stack.get(size-1) == 1) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}