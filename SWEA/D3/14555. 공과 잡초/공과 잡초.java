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
            int answer = 0;
            String input = sc.next();
            
            for (int i=0;i<input.length()-1;i++) {
                String a = "" + input.charAt(i);
                String b = "" + input.charAt(i+1);
                
                if (a.equals("(") && (b.equals(")") || b.equals("|"))) answer++;
                else if (a.equals("|")) {
                    if (b.equals(")")) answer++;
                }
            }
            
            System.out.println(answer);
		}
	}
}