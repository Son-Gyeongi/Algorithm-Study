import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int answer = 0;
            int N = sc.nextInt();
            int[] arr = new int[N];
            
            int avg = 0;
            for (int i=0;i<N;i++) {
                int input = sc.nextInt();
                avg += input;
                arr[i] = input;
            }
            
            avg /=N;
            
            for (int i=0;i<N;i++) {
                if (arr[i] > avg) answer += arr[i]-avg;
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}