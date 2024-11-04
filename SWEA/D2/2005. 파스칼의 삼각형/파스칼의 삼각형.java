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
            System.out.printf("#%d\n",test_case);
            
            int input = sc.nextInt();
            
            int[][] arr = new int[input][input]; // 더한 후 저장할 값
            arr[0][0] = 1;
            
            if (input >= 2) {
                arr[1][0] = 1;
                arr[1][1] = 1;
            }
            
            for (int i=2;i<input;i++) {
                for (int j=0;j<=i;j++) {
                    if (j==0 || j==i) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    }
                }                
            }
            
            for (int i=1;i<=input;i++) {
                for (int j=0;j<i;j++) {
                    System.out.print(arr[i-1][j] + " ");
                }
                System.out.println();
            }
		}
	}
}