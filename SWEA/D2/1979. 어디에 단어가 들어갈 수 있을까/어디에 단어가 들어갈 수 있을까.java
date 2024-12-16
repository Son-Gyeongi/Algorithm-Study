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
            
            int puzzleSize = sc.nextInt();
            int strLength = sc.nextInt();
            
            // 2차원 배열에 주어진 값 넣기
            int[][] puzzle = new int[puzzleSize][puzzleSize];
            for (int i=0;i<puzzleSize;i++) {
                for (int j=0;j<puzzleSize;j++) {
                    puzzle[i][j] = sc.nextInt();
                }
            }
            
            int count = 0; // 주어진 길이에 맞는 칸 수
            
            // 가로 행에서 찾기
            for (int i=0;i<puzzle.length;i++) {
                int sum = 0;
                
                for (int j=0;j<puzzle[i].length;j++) {
                    int temp = puzzle[i][j];
                    
                    if (temp == 1) {
                        sum++;
                        if (sum == strLength && j == puzzle[i].length-1) count++;
                    } else {
                        if (sum == strLength) count++;
                        sum = 0;
                    }
                }
            }
            
            // 세로 열에서 찾기
            for (int j=0;j<puzzle[0].length;j++) {
                int sum = 0;
                
                for (int i=0;i<puzzle.length;i++) {
                    int temp = puzzle[i][j];
                    
                    if (temp == 1) {
                        sum++;
                        if (sum == strLength && i == puzzle.length-1) count++;
                    } else {
                        if (sum == strLength) count++;
                        sum = 0;
                    }
                }
            }
            
            System.out.println(count);
		}
	}
}