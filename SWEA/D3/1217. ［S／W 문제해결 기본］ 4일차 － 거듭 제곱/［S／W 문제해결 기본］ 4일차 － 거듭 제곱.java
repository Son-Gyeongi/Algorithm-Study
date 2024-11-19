import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int i = 1; i <= 10; i++)
		{
            int test_no=sc.nextInt();
            int N = sc.nextInt();
            int M = sc.nextInt();
            int result = 0;

            result = power(N, M);

            System.out.println("#"+test_no+" "+result);
		}
	}
    
    public static int power(int n, int m) {
        if (m == 0) return 1;
        
        return n*power(n, --m);      
    }
}