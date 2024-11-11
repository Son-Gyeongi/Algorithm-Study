import java.util.Scanner;
import java.util.*;

class Solution
{
    public static int[] days;
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ",test_case);
            
            // 입력값 배열에 담기
            int N = sc.nextInt();
            days = new int[N];
            int[] ascending = new int[N]; // days 오름차순하기
            for (int i=0;i<N;i++) {
                days[i] = sc.nextInt();
                ascending[i] = days[i];
            }
            
            Arrays.sort(ascending);
            
            // 적은 값일 때 사서 큰 값을 만나면 팔면된다.
            long sum = salesProfit(0, ascending[N-1]);
            
            System.out.println(sum);
		}
	}
    
    public static long salesProfit(int start, int bigNumber) {
        if (start == days.length) return 0;
        
        long count = 0; // 원료 산 개수
        long purchase = 0; // 구입 가격 더하기
        long sum = 0; // 판매 이익
        int index = 0; // 다음 구간 시작 인덱스
        for (int i=start;i<days.length;i++) {
            if (days[i] == bigNumber) {
                // 큰 값 찾으면 판다.
                sum += ((count*days[i])-purchase);
                index = i+1;
                break;
            }
            else {
                // 산다.
                purchase += days[i];
                count++;
            }
        }
        
        // 큰 수 구하기
        int[] ascending = new int[days.length-index+1];
        int x = 0; // ascending 인덱스
        for (int i=index;i<days.length;i++) {
            ascending[x++] = days[i];
        }
        
        Arrays.sort(ascending);
        
        return sum + salesProfit(index, ascending[ascending.length-1]);
    }
}