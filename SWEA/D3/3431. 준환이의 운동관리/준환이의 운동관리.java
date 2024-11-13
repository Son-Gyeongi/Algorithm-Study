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
            System.out.printf("#%d ", test_case);
            
            int L = sc.nextInt();
            int U = sc.nextInt();
            int X = sc.nextInt();
            int result = 0;
            
            if (X < L) result = L-X;
            else if (X > U) result = -1;
            
            System.out.println(result);
		}
	}
}