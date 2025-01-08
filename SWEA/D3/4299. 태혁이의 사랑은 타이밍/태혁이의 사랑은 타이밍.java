import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int d = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();
            int standard = (11*24*60)+(11*60)+11; // 11일 11시 11분을 분으로 표현
            int compare = (d*24*60)+(h*60)+m;
            System.out.println("#"+test_case+" "+(standard==compare ? 0 : (standard > compare ? -1 : compare-standard)));
		}
	}
}