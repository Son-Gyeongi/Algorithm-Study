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
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int i=0;i<10;i++) {
                int input = sc.nextInt();
                int sum = 0;
                
                while (input != 0) {
                    int remain = input%10;
                    sum+= remain;
                    input = input/10;
                }
                
                max = Math.max(max,sum);
                min = Math.min(min,sum);
            }
            
            System.out.println(max+" "+min);
		}
	}
}