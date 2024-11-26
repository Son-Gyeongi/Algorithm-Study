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
            int N = sc.nextInt(); // N명
            int M = sc.nextInt(); // M문제
            
            int[] arr = new int[N];
            for (int i=0;i<N;i++) {
                for (int j=0;j<M;j++) {
                    arr[i] += sc.nextInt();
                }
            }
            
            // arr 배열에서 1등 구하기
            int count = 1; // 1등 수
            int max = arr[0]; // 1등의 최대값
            for (int i=1;i<arr.length;i++) {
                if (arr[i] > max) {
                    count = 1;
                    max = arr[i];
                } else if (arr[i] == max) count++;
            }
            
            System.out.println(count+" "+max);
		}
	}
}