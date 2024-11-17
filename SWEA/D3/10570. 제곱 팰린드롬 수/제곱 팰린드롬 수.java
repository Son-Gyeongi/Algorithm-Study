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
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int count = 0;
            for (int i=1;i<=100;i++) { // i는 루트 N의 값
                int square = (int) Math.pow(i, 2); // N 의 값
                
                if (square < A) continue;
                if (square > B) break;
                
                if (A <= square && square <= B) {
                    if (i <= 3) count++;
                    else {
                        // square 가 회문인지 확인하기, i 가 회문인지 확인하기
                        String squareStr = String.valueOf(square);
                        String iStr = String.valueOf(i);
                        if (palindrome(squareStr) && palindrome(iStr)) count++;
                    }
				}
			}
            
            System.out.println(count);
		}
	}
    
    public static boolean palindrome(String str) {
        boolean b = true;
        Stack<String> stack = new Stack<>();
        String[] strArr = str.split("");
        
        for (int i=0;i<strArr.length/2;i++) {
            stack.push(strArr[i]);
        }
        
        // stack에 쌓여진 값과 비교하기
        int start = strArr.length%2 == 0 ? strArr.length/2 : strArr.length/2+1;
        for (int i=start;i<strArr.length;i++) {
            String tempStr = stack.pop();
            
            if (!tempStr.equals(strArr[i])) {
                b = false;
                break;
            }
        }
        
        return b; // 회문일 경우 true, 아닐 경우 false
    }
}