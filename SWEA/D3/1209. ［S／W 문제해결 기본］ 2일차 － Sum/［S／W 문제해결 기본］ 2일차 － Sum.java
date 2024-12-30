import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>(); // 행, 열, 대각선 합의 모음
            int[] columnSum = new int[100]; // 열 총합
            int leftToRight = 0; // 왼쪽에서 오른쪽 대각선
            int rightToLeft = 0; // 오른쪽에서 왼쪽 대각선
            
            for (int i=0;i<100;i++) {
                int rowSum = 0;
                
                for (int j=0;j<100;j++) {
                    int input = sc.nextInt();
                    rowSum += input;
                    columnSum[j] += input;
                    
                    if (i==j) leftToRight += input;
                    if (i+j == 99) rightToLeft += input;
                }
                
                set.add(rowSum); // 행 총합
            }
            
            set.add(leftToRight); set.add(leftToRight);
            
            for (int i=0;i<100;i++) set.add(columnSum[i]);
            
            System.out.println("#"+test_case +" " +set.last());
		}
	}
}