import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ",test_case);
            int count = sc.nextInt();
            Stack<Integer> money = new Stack<>();
            
            for (int i=0;i<count;i++) {
                int input = sc.nextInt();
                
                if (input == 0) money.pop();
                else money.push(input);
            }
            
            int sum = 0;
            while (!money.isEmpty()) sum += money.pop();
            
            System.out.println(sum);
		}
	}
}