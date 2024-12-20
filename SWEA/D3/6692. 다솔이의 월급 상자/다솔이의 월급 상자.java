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
            double sum = 0.0;
            
            for (int i=0;i<N;i++) {
                double percent = sc.nextDouble();
                int money = sc.nextInt();
                sum += (percent*money);
            }
            
            System.out.printf("%.6f", sum);
		}
	}
}