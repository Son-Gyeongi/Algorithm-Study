import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ", test_case);
            
            Integer[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            
            int firstMonth = sc.nextInt();
            int firstDay = sc.nextInt();
            int secondMonth = sc.nextInt();
            int secondDay = sc.nextInt();
            
            int a = days[firstMonth] - firstDay +1; // 첫번째 날에서 그 달의 끝까지 며칠 걸리는지 확인
            int b = secondDay; // 두번째 날에서 그 달에 며칠 걸리는지 확인
            
            int result = a+b;
            if (secondMonth - firstMonth > 1) {
                // secondMonth - firstMonth > 1 한 경우 그 사이에 달들을 세어줘야 한다.
                
                for (int i=firstMonth+1;i<secondMonth;i++) {
                    result += days[i];
                }
            } else if (firstMonth == secondMonth) {
                result = secondDay - firstDay +1;
            }
            
            System.out.println(result);
		}
	}
}