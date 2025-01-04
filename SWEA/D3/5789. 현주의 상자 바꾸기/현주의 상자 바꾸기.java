import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt(); // 상자 개수
            int Q = sc.nextInt(); // Q회 동안 작업
            int[] boxes = new int[N+1];
            
            for (int i=1;i<=Q;i++) {
                int L = sc.nextInt(); // 바뀌는 인덱스 시작
                int R = sc.nextInt(); // 바뀌는 인덱스 끝
                
                for (int j=L;j<=R;j++) boxes[j] = i;
            }
            
            System.out.printf("#%d ", test_case);
            for (int i=1;i<boxes.length;i++) System.out.printf("%d%s", boxes[i], (i==boxes.length-1)?"\n":" ");
		}
	}
}