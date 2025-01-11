import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int K = sc.nextInt();
            int max = N/K + (N%K == 0 ? 0 : 1);
            int min = N/K;
            System.out.println("#"+test_case+" "+(max-min));
		}
	}
}