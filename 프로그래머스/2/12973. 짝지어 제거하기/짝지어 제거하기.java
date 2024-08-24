import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<String> stack = new Stack<>();
        String str = "" + s.charAt(0);
        stack.push(str);
        
        for (int i=1;i<s.length();i++) {
            str = "" + s.charAt(i);
            
            if (!stack.isEmpty() && stack.peek().equals(str)) {
                stack.pop();
                continue;
            }
            
            stack.push(str);
        }

        return stack.isEmpty() ? 1 : 0;
    }
}