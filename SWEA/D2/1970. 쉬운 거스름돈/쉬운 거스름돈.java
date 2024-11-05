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
            System.out.println("#"+test_case);
            
            int money = sc.nextInt();
            change(money, 50000);
            
            System.out.println();
		}
	}
    
    public static void change(int money, int won) {
        if (won == 5) return;
        
        if (money >= won) {
            int count = money/won;
            money = money%won;
            System.out.print(count+" ");
        } else {
            System.out.print("0 ");
        }
        
        change(money, String.valueOf(won).contains("5") ? won / 5 : won / 2);
    }
}