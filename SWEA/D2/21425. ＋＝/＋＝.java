import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for (int tc=0;tc<T;tc++) {
            // x,y 숫자가 주어질 때 숫자가 작은 쪽이 기준이 된다.
            int x = sc.nextInt();
            int y = sc.nextInt();
            int N = sc.nextInt();
            
            int count = 0;
            while (x <= N && y <= N) {
                if (x <= y) x = x + y;
                else y = y + x;
                count++;
            }
            
            System.out.println(count);
        }
	}
}