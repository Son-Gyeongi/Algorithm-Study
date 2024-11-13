import java.util.Scanner;

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
            int result = A*B;
            
            if (A >= 10 || B >= 10) result = -1;
            
            System.out.println(result);
		}
	}
}