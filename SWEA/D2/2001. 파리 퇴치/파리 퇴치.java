import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] flies = new int[N][N];
            
            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    flies[i][j] = sc.nextInt();
                }
            }
            
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<=N-M;i++) {
                for (int j=0;j<=N-M;j++) {
                    int sum = 0;
                    
                    for (int x=i;x<i+M;x++) {
                        for (int y=j;y<j+M;y++) {
                            sum += flies[x][y];
                        }
                    }
                    
                    list.add(sum);
                }
            }
            
            Collections.sort(list);
            
            System.out.println("#"+test_case+" "+list.get(list.size()-1));
		}
	}
}