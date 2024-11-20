import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            System.out.printf("#%d ",test_case);
            
            int N=sc.nextInt();
            String[][] arr1 = new String[8][8]; // 가로 배열 저장
            String[][] arr2 = new String[8][8]; // 세로 배열 저장
            
            for (int i=0;i<8;i++) {
                String input = sc.next();
                String[] inputArr = input.split("");
                
                for (int j=0;j<8;j++) {
                    arr1[i][j] = inputArr[j];
                    arr2[j][i] = inputArr[j];
                }
            }
            
            int count = 0;
            for (int i=0;i<8;i++) {
                for (int j=0;j<=8-N;j++) {
                    String str1 = "";
                	String str2 = "";
                    
                    for (int k=j;k<j+N;k++) {
                        str1 += arr1[i][k];
                        str2 += arr2[i][k];
                    }
                    
                    if (palindrome(str1, N)) count++;
                    if (palindrome(str2, N)) count++;
                }
            }
            
            System.out.println(count);
		}
	}
    
    public static boolean palindrome(String str, int N) {
        Stack<String> stack = new Stack<>();
        boolean b = true;
        String[] strArr = str.split("");

        for (int i=0;i<N/2;i++) {
            stack.push(strArr[i]);
        }

        int start = N%2 == 0 ? N/2 : N/2+1;
        for (int i=start;i<N;i++) {
            String stackStr = stack.pop();

            if (!stackStr.equals(strArr[i])) {
                b = false;
                break;
            }
        }
        
        return b; // 회문이면 true, 아니면 false
    }
}