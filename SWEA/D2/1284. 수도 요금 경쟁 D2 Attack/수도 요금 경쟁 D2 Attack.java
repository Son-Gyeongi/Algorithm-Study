import java.util.Scanner;
import java.io.FileInputStream;

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
            
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();
            
            // A사 요금 계산
            int a = W*P;
            
            // B사 요금 계산
            int b;
            if (R >= W) {
                // R 리터 이하 사용한 경우 요금
                b = Q;
            } else {
                // R 리터 초과 사용한 경우 요금
                b = Q +((W-R)*S);
            }
            
            System.out.println(Math.min(a,b));
		}
	}
}