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
            double p = sc.nextDouble();
            double q = sc.nextDouble();
            
            // 1번 뒤집을 확률 - 올바르지 않은 면 -> 뒤집음 -> 정상 꽂힘
            double s1 = (1-p)*q;
            // 2번 뒤집을 확률 - 올바른 면 -> 비정상 꽂힘 -> 뒤집음 -> (올바르지 않은 면) -> 뒤집음 -> 정상 꽂힘
            double s2 = p*(1-q)*q;
            
            System.out.println(s1<s2?"YES":"NO");
		}
	}
}