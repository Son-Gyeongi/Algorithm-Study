import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        
        do {
            count++;
            // 처음 닫는 괄호가 나오면 실패, 마지막에 여는 괄호가 나오면 실패
            if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']'
               || s.charAt(s.length()-1) == '(' || s.charAt(s.length()-1) == '{' || s.charAt(s.length()-1) == '[') {
                String str = ""+s.charAt(0);
                s = s.substring(1) + str;
                continue;
            }
            
            boolean b = true;
            Stack<Character> stack = new Stack<>();
            for (int i=0;i<s.length();i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') stack.push(s.charAt(i));
                else {
                    if (stack.isEmpty()) {
                        if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                            b = false;
                        }
                        break;
                    }
                    else if ((stack.peek() == '(' && s.charAt(i) == ')')
                            || (stack.peek() == '{' && s.charAt(i) == '}')
                            || (stack.peek() == '[' && s.charAt(i) == ']')) {
                        stack.pop();
                    }
                }
            }
            
            if (!b) {
                String str = ""+s.charAt(0);
                s = s.substring(1) + str;
                continue;
            }
            else if (stack.isEmpty()) {
                answer++;
            }
            
            String str = ""+s.charAt(0);
            s = s.substring(1) + str;
        } while (count < s.length());
        
        return answer;
    }
}