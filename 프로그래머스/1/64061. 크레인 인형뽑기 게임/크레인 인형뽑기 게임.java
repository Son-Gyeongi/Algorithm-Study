import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0;i<moves.length;i++) {
            int move = moves[i] - 1;
            
            for (int j=0;j<board.length;j++) {
                if (board[j][move] == 0) continue;
                
                stack.push(board[j][move]);
                // 스택에 넣은 숫자는 0으로 바꾸기
                board[j][move] = 0;
                break;
            }
            
            int size = stack.size();
            if (size > 1 && (stack.get(size-1) == stack.get(size-2))) {
                stack.pop();
                stack.pop();
                answer += 2;
            }
        }
        
        return answer;
    }
}