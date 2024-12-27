import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int[] arr = new int[N];
            
            for (int i=0;i<N;i++) arr[i] = sc.nextInt();
            
            int count = 0;
            for (int i=0;i<N-2;i++) {
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                
                for (int j=i;j<i+3;j++) {
                    max = Math.max(max,arr[j]);
                    min = Math.min(min,arr[j]);
                }
                
                if (min < arr[i+1] && arr[i+1] < max) count++;
            }
            
            System.out.println("#"+test_case+" "+count);
		}
	}
}