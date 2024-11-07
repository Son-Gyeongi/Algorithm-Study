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
            
            Integer[] arr = new Integer[10];
            
            for (int i=0;i<10;i++) {
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr); // 오름차순 정렬
            
            int sum = 0;
            for (int i=1;i<9;i++) {
                sum+=arr[i];
            }
            
            double result = sum/8.0;
            System.out.println(Math.round(result));
		}
	}
}