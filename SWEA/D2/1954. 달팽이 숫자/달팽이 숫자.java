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
            System.out.printf("#%d\n", test_case);
            int N = sc.nextInt();
            int[][] snail = new int[N][N]; // N X N 숫자 저장
            
            int count = 1; // 연속된 수
            int index = 0; // 고정되는 배열 인덱스 - 행 또는 열
            int a = 0; // 증가 연산, 감소 연산
            int start = 0; // 변경되는 인덱스 시작 - 행 또는 열
            int[] ends = {N-1, N-1, 0, 1}; // 변경되는 인덱스 끝 - 오른쪽 증가, 아래쪽 증가, 왼쪽 증가, 위쪽 증가
            int idx = 0; // ends 인덱스
            
            while (count != N*N+1) {
                int end = ends[idx];// 끝나는 시점
                
                if (idx%2==0) {
                    // 배열 좌표(x,y)에서 왼쪽(x)이 고정값
                    if (start < end) for (int i=start;i<=end;i++) snail[index][i] = count++;
                    else for (int i=start;i>=end;i--) snail[index][i] = count++;
                } else {
                    // 배열 좌표(x,y)에서 오른쪽(y)이 고정값
                    if (start < end) for (int i=start;i<=end;i++) snail[i][index] = count++;
                    else for (int i=start;i>=end;i--) snail[i][index] = count++;
                }
                
                // 계산 끝난 후
                start = idx== 0 || idx == 3 ? index+1 : index-1; // idx 0,1,2,3 기준으로 index +1,-1,-1,+1 이 된다.
                index = end;
                if (idx==0 || idx == 1) ends[idx]--;
                else ends[idx]++;
                idx = idx == ends.length-1 ? 0 : ++idx;
            }
            
            // snail 배열 출력
            for (int i=0;i<snail.length;i++) {
                StringBuilder sb = new StringBuilder();
                
                for (int j=0;j<snail[0].length;j++) {
                    sb.append(snail[i][j]).append(" ");
                }
                
                System.out.println(sb);
            }
		}
	}
}