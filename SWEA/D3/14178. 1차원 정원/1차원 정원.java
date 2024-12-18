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
            int N = sc.nextInt();
            int D = sc.nextInt();
            System.out.println("#"+test_case+" "+((N/(2*D+1))+(N%(2*D+1) == 0 ? 0 : 1)));
		}
	}
}