import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int d = sc.nextInt();
            int l = sc.nextInt(); // 소문자 엘
            int n = sc.nextInt();
            
            int sum = 0;
            for (int i=0;i<n;i++) sum += Math.round(d*(1+i*(l/100f)));
            
            System.out.println("#"+test_case+" "+sum);
		}
	}
}