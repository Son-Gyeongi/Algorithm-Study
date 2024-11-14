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
            
            String input = sc.next();
            String replaceInput = input.replaceAll("[a|e|i|o|u]", "");
            
            System.out.println(replaceInput);
		}
	}
}