import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        for (int i=1;i<=T/2;i++) {
            if (T%i == 0) System.out.print(i+" ");
        }
        System.out.print(T);
	}
}