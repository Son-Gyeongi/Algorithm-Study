import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String ss = s+s;
        
        for (int i=0;i<s.length();i++) {
            Stack<Character> stack = new Stack<>();
            boolean b = true;
            int length = s.length();
            
            for (int j=i;j<length+i;j++) {
                
                if (ss.charAt(j) == '[' || ss.charAt(j) == '{' || ss.charAt(j) == '(') {
                    stack.push(ss.charAt(j));
                } else if (stack.isEmpty()
                          && (ss.charAt(j) == ']' || ss.charAt(j) == '}' || ss.charAt(j) == ')')) {
                    b = false;
                    break;
                }
                
                if (!stack.isEmpty()) {
                    if (ss.charAt(j) == ']') {
                        if (stack.peek() == '[') stack.pop();
                        else {
                            b = false;
                            break;
                        }
                    }
                    else if (ss.charAt(j) == '}') {
                        if (stack.peek() == '{') stack.pop();
                        else {
                            b = false;
                            break;
                        }
                    }
                    else if (ss.charAt(j) == ')') {
                        if (stack.peek() == '(') stack.pop();
                        else {
                            b = false;
                            break;
                        }
                    }
                }
            }
            
            if (!stack.isEmpty()) continue;
            
            if (b) answer++;
        }
        
        return answer;
    }
}