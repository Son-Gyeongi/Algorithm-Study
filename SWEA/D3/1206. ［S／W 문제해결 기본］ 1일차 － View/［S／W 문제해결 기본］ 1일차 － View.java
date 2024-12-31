import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int N = sc.nextInt();
            int[] floor = new int[N];
            
            for (int i=0;i<N;i++) floor[i] = sc.nextInt();
            
            int sum = 0;
            for (int i=2;i<floor.length-2;i++) {
                int a = floor[i-2];
                int b = floor[i-1];
                int c = floor[i];
                int d = floor[i+1];
                int e = floor[i+2];
                
                if ((a-c<=0 && b-c<=0) && (c-d>0 && c-e>0)) {
                    int temp = Math.min(Math.abs(a-c), Math.abs(b-c));
                    temp = Math.min(temp, Math.abs(c-d));
                    temp = Math.min(temp, Math.abs(c-e));
                    sum += temp;
                }
            }
            
            System.out.println("#"+test_case+" "+sum);
		}
	}
}