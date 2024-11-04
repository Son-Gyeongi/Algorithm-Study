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
            
            int answer = 1;
            int[] lengthSum = new int[9]; // 세로 검사
            int[][] squareSum = new int[3][3]; // 3X3 검사
            int x = 0; // 3X3 에서 행 인덱스
            
            for (int i=0;i<9;i++) {
                int sum = 0; // 가로 검사
                
                if (i <= 2) {
                    x = 0;
                } else if (i <= 5) {
                    x = 1;
                } else {
                    x = 2;
                }
                
                for (int j=0;j<9;j++) {
                    int input = sc.nextInt();
                    
                    sum+=input; // 가로 더하기
                    lengthSum[j] += input; // 세로 더하기
                    
                    // 네모 더하기
                    if (j <= 2) {
                        squareSum[x][0] += input;
                    } else if (j <= 5) {
                        squareSum[x][1] += input;
                    } else {
                        squareSum[x][2] += input;
                    }

                    if ((j == 8 && sum !=45)
                       || (i == 8 && lengthSum[j] != 45)) {
                        answer = 0;
                    }
                }
            }
            
            if (answer == 0) {
                System.out.println(answer);
                continue;
            }
            
            // 네모 크기 검사에서 45가 없는 경우 answer 에 0 주기
            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++) {
                    if (squareSum[i][j] != 45) {
                        answer = 0;
                        break;
                    }
                }
                
                if (answer == 0) break;
            }
            
            System.out.println(answer);
		}
	}
}