import java.util.Scanner;
import java.util.*;

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
            int[] gallery = new int[N];
            
            for (int i=0;i<N;i++) gallery[i] = sc.nextInt();
            
            Arrays.sort(gallery);
            
            int sum = 0;
            for (int i=0;i<N;i++) sum += gallery[i];
            
            System.out.println("#"+test_case+" "+(N+sum+gallery[N-1]));
		}
	}
}