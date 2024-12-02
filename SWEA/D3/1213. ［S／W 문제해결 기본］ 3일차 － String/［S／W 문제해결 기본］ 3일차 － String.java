import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int num = sc.nextInt();
            System.out.printf("#%d ", num);
            String input = sc.next();
            String str = sc.next();
            String temp = str.replaceAll(input, "");
            System.out.println((str.length()-temp.length())/input.length());
		}
	}
}