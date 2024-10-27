import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ",test_case);
            
            int result = 1;
            String palindrome = sc.next();
            String[] palArr = palindrome.split("");
            int length = palArr.length;
            
            Stack<String> stack = new Stack<>();
            if (length%2 == 1) {
                // 문자열 길이가 홀수인 경우
                
                // Stack 에 넣기
                for (int i=0;i<length/2;i++) {
                    stack.push(palArr[i]);
                }
                
                // Stack 과 비교
                for (int j=length/2+1;j<length;j++) {
                    String str = stack.pop();
                    
                    if (!str.equals(palArr[j])) {
                        result = 0;
                        break;
                    }
                }
            } else {
                // 문자열 길이가 짝수인 경우
                
                // Stack 에 넣기
                for (int i=0;i<length/2;i++) {
                    stack.push(palArr[i]);
                }
                
                // Stack 과 비교
                for (int j=length/2;j<length;j++) {
                    String str = stack.pop();
                    
                    if (!str.equals(palArr[j])) {
                        result = 0;
                        break;
                    }
                }
            }
            
            System.out.println(result);
		}
	}
}