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
            int N = sc.nextInt();
            String str1 = sc.next();
            String[] str1arr = str1.split("");
            String str2 = sc.next();
            String[] str2arr = str2.split("");
            
            int count = 0;
            for (int i=0;i<N;i++) {
                if (str1arr[i].equals(str2arr[i])) count++;
            }
            
            System.out.println(count);
		}
	}
}