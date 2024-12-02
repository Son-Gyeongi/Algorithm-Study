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
            String str = sc.next();
            int strLength = str.length();
            int last = Integer.parseInt(""+str.charAt(strLength-1));
            
            if (last%2 == 0) System.out.println("Even");
            else System.out.println("Odd");
		}
	}
}