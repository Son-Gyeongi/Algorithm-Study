import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		System.out.print("1 ");
        
        int mul = 1;
        for (int i=0;i<T;i++) {
            mul *= 2;
            System.out.printf("%d ", mul);
        }
	}
}