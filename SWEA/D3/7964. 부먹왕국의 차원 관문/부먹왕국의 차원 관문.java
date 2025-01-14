import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int answer = 0;
            int n = sc.nextInt();
            int d = sc.nextInt();
            int count = 0; // 1과 1 사이의 0 개수 구하기
            
            for (int i=0;i<n;i++) {
                if (sc.nextInt() == 0) count++;
                else {
                    if (count > 0) {
                        answer += count/d;
                        count = 0; // 다시 0 개수 세기
                    }
                }
            }
            
            System.out.println("#"+test_case+" "+(n==count?count/d:answer));
		}
	}
}