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
            int[] arr = new int[N];
            int sum = 0; // 평균 내기 위해서 더함
            
            for (int i=0;i<N;i++) {
                int input = sc.nextInt();
                arr[i] = input;
                sum += input;
            }
            
            int avg = sum/N;
            Arrays.sort(arr); // 배열의 모든 요소를 탐색하지 않기 위해서 정렬
            
            int count = 0;
            for (int i=0;i<N;i++) {
                if (arr[i] <= avg) count++;
                else break;
            }
            
            System.out.println(count);
		}
	}
}