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
            String[] strArr = {sc.next(),sc.next(),sc.next()};
            
            StringBuilder upper = new StringBuilder();
            for (int i=0;i<strArr.length;i++) {
                String lower = ""+strArr[i].charAt(0);
                upper.append(lower.toUpperCase());
            }
            
            System.out.println(upper);
		}
	}
}