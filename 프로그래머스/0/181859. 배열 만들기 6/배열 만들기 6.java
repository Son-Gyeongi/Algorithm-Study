import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
       Stack<Integer> stk = new Stack<>();
        
        // 1. stk 요소가 없으면(else) - arr[i]을 stk에 넣기
        // 2. stk 요소가 있으면(if) - stk 마지막 원소와 arr[i] 비교했을 때
        // - 같으면(if) stk 마지막 요소 제거 (Stack의 pop)
        // - 다르면(else) stk 배열에 arr[i] 넣기 (Stack의 push)
        for (int i=0;i<arr.length;i++) {
            if (!stk.isEmpty()) {
                if (stk.peek() == arr[i]) {
                    stk.pop();
                } else {
                    stk.push(arr[i]);
                }
            } else {
                // 배열에 요소가 없다면
                stk.push(arr[i]);
            }
        }
        
        // 3. 빈 배열 일 경우 [-1] 반환
        if (stk.isEmpty()) {
            return new int[]{-1};
        }
        
        // 4. stk에 있는 값 answer 배열에 넣기
        // System.out.println(stk);
        // System.out.println(stk.size());
        answer = new int[stk.size()];
        for (int i= answer.length-1;i>=0;i--) {
            answer[i] = stk.pop();
        }
        
        return answer;
    }
}