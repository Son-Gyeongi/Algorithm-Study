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
            String[] arr = new String[N];
            
            for (int i=0;i<N;i++) arr[i] = sc.next();
            
            int add = N%2==0 ? N/2 : N/2+1;
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<N/2;i++) sb.append(arr[i]).append(" ").append(arr[i+add]).append(" ");
            
            if (N%2 == 1) sb.append(arr[N/2]);
            
            System.out.println("#"+test_case+" "+sb.toString());
		}
	}
}