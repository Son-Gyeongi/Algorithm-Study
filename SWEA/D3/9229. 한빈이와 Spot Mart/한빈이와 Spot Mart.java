import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int answer = -1;
            int n = sc.nextInt(); // 과자 개수
            int m = sc.nextInt(); // 과자 2개 무게 제한 합
            int[] arr = new int[n];
            
            for (int i=0;i<n;i++) arr[i] = sc.nextInt();
            
            Arrays.sort(arr);
            
            for (int i=0, j=arr.length-1;i<arr.length;) {
                if (i==j) break;
                
                if (arr[i]+arr[j] == m) {
                    answer = arr[i]+arr[j];
                    break;
                } else if (arr[i]+arr[j] > m) {
                    j--;
                } else {
                    // arr[i]+arr[j] < m
                    answer = Math.max(answer, arr[i]+arr[j]);
                    i++;
                }
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}