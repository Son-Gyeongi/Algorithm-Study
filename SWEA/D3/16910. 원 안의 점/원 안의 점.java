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
            int sum = 1 + 4*N; // 원점과 수직, 수평으로 있는 점 포함
            int circle = (int) Math.pow(N,2);
            
            // (1, 1) 부터 (N-1, N-1)까지 x^2+y^2<=N^2 계산해서 카운트하기
            int count = 0;
            for (int i=1;i<N;i++) {
                for (int j=1;j<N;j++) {
                    int x = (int) Math.pow(i,2);
                    int y = (int) Math.pow(j,2);
                    
                    if (x+y <= circle) count++;
                }
            }
            
            sum += 4*count; // 1/4만 카운트 했으므로 *4 해야함
            
            System.out.println(sum);
		}
	}
}