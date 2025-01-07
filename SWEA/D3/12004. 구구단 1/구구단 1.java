import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            String answer = "No";
            
            for (int i=2;i<=9;i++) {
                if (n%i==0 && (n/i <=9)) answer = "Yes";
            }
            
            System.out.println("#"+test_case+" "+(n==1?"Yes":answer));
		}
	}
}