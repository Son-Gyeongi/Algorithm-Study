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
            System.out.println("#"+test_case);
            
            // 입력값 2차원 배열에 넣기
            int N = sc.nextInt();
            Integer[][] nArr = new Integer[N][N];
            
            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    nArr[i][j] = sc.nextInt();
                }
            }
            
            // 90도
            Integer[][] arr1 = new Integer[N][N];
            int x = 0;
            for (int i=N-1;i>=0;i--) {
                int y = 0;
                for (int j=0;j<N;j++) {
                    arr1[j][i] = nArr[x][y];
                    y++;
                }
                x++;
            }
            
            // 180도
            Integer[][] arr2 = new Integer[N][N];
            x = 0;
            for (int i=N-1;i>=0;i--) {
                int y = 0;
                for (int j=N-1;j>=0;j--) {
                    arr2[i][j] = nArr[x][y];
                    y++;
                }
                x++;
            }
            
            // 270도
            Integer[][] arr3 = new Integer[N][N];
            x = 0;
            for (int i=0;i<N;i++) {
                int y = 0;
                for (int j=N-1;j>=0;j--) {
                    arr3[j][i] = nArr[x][y];
                    y++;
                }
                x++;
            }
            
            // 정답 출력문 만들기
            for (int i=0;i<N;i++) {
                StringBuilder str1 = new StringBuilder();
                StringBuilder str2 = new StringBuilder();
                StringBuilder str3 = new StringBuilder();
                
                for (int j=0;j<N;j++) {
                    String a1 = String.valueOf(arr1[i][j]);
                    String a2 = String.valueOf(arr2[i][j]);
                    String a3 = String.valueOf(arr3[i][j]);
                    
                    str1.append(a1);
                    str2.append(a2);
                    str3.append(a3);
                }
                
                System.out.println(str1.toString()+" "+str2.toString()+" "+str3.toString());
            }
		}
	}
}