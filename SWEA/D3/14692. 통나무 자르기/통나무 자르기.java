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
            // 짝수면 Alice가 승, 홀수면 Bob이 승
            int num = sc.nextInt();
            System.out.println("#"+test_case+" "+(num%2==0?"Alice":"Bob"));
		}
	}
}