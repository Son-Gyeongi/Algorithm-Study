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
            
            int[] arr = new int[N];
            for (int i=0;i<N;i++) {
                int input = sc.nextInt();
                arr[i] = input;
            }
            
            int min = 0;
            int max = 0;
            for (int i=0;i<arr.length-1;i++) {
                if (arr[i] < arr[i+1]) max = Math.max(max, arr[i+1]-arr[i]);
                else if (arr[i] > arr[i+1]) min = Math.max(min, arr[i]-arr[i+1]);
            }
            
            System.out.println(max+" "+min);
		}
	}
}