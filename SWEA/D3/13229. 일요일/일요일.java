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
            String dayOfTheWeek = sc.next();
            int result = 0;
            
            switch (dayOfTheWeek) {
                case "MON" : result = 6;
                    break;
                case "TUE" : result = 5;
                    break;
                case "WED" : result = 4;
                    break;
                case "THU" : result = 3;
                    break;
                case "FRI" : result = 2;
                    break;
                case "SAT" : result = 1;
                    break;
                case "SUN" : result = 7;
                    break;
            }
            
            System.out.println(result);
		}
	}
}