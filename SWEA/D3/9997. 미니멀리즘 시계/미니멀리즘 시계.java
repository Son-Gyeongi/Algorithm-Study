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
            int input = sc.nextInt()*2;
            
            int h = input/60;
            int m = input%60;
            
            System.out.println(h+" "+m);
		}
	}
}