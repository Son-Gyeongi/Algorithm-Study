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
            System.out.printf("#%d ",test_case);
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            PriorityQueue<Integer> scores = new PriorityQueue<>(Collections.reverseOrder());
            for (int i=0;i<N;i++) scores.offer(sc.nextInt());
            
            int sum = 0;
            for (int i=0;i<K;i++) sum += scores.poll();
            
            System.out.println(sum);
		}
	}
}