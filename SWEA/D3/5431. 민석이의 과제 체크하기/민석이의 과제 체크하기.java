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
            
            int N = sc.nextInt(); // 총 인원
            int K = sc.nextInt(); // 과제 제출한 사람
            
            List<Integer> done = new ArrayList<>();
            for (int i=0;i<K;i++) {
                done.add(sc.nextInt());
            }
            
            for (int i=1;i<=N;i++) {
                if (!done.contains(i)) System.out.print(i+" ");
            }
            
            System.out.println();
		}
	}
}