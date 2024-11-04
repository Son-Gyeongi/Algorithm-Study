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
            System.out.printf("#%d ",test_case);
            
            int hour1 = sc.nextInt();
            int minute1 = sc.nextInt();
            int hour2 = sc.nextInt();
            int minute2 = sc.nextInt();
            
            int hour = hour1+hour2;
            int minute = minute1 + minute2;
            
            if (hour > 12) hour -= 12;
            
            int extraHour = 0; // 추가 시간
            if (minute > 59) {
                extraHour = minute/60;
                minute = minute%60;
            }
            
            System.out.println(hour+extraHour + " " + minute);
		}
	}
}