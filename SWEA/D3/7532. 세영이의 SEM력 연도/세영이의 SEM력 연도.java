import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int S = sc.nextInt();
            int E = sc.nextInt();
            int M = sc.nextInt();
            
            int i = 1;
            while (true) {
                int s = i%365 == 0 ? 365 : i%365;
                int e = i%24 == 0 ? 24 : i%24;
                int m = i%29 == 0 ? 29 : i%29;
                
                if (s==S && e==E && m==M) break;
                i++;
            }
            
            System.out.println("#"+test_case+" "+i);
		}
	}
}