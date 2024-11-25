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
            
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int min = Math.min(N, M);
            int max = Math.max(N, M);
            
            for (int i=min;i<=max;i++) {
                System.out.print(1+i+" ");
            }
            
            System.out.println();
		}
	}
}