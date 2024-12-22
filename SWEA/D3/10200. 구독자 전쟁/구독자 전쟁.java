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
            int N = sc.nextInt(); // 사람 수
            int A = sc.nextInt(); // P 채널 구독자
            int B = sc.nextInt(); // T 채널 구독자
            
            System.out.println("#"+test_case+" "+Math.min(A,B)+" "+(N < A+B ? A+B-N : 0));
		}
	}
}