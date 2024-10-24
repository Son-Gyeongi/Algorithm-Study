import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int A, B;
		A=sc.nextInt();
        B=sc.nextInt();
        
        int cal = A-B;
        
        // 가위는 1, 바위는 2, 보는 3
        if (cal == -1) System.out.print("B");
        else if (cal == -2) System.out.print("A");
        else if (cal == 1) System.out.print("A");
        else if (cal == 2) System.out.print("B");
	}
}