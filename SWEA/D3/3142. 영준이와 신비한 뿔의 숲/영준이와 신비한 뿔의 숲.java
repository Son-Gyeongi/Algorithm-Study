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
            int N = sc.nextInt(); // 뿔 수
            int M = sc.nextInt(); // 동물 수
            
            int twin = 0, uni = 0;
            int decrease = 0; // N/2 했을 때 나온 몫에서 트윈혼 동물 1마리씩 뺀다.
            while (twin+uni != M) {
                twin = N/2-decrease++;
                uni = N-(2*twin);
            }
            
            System.out.println(uni+" "+twin);
		}
	}
}