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
            
            String str = sc.next();
            String[] strArr = str.split("");
            
            int count = 0;
            if (strArr[0].equals("1")) count = 1;
            
            for (int i=1;i<strArr.length;i++) {
                if (strArr[i-1].equals("0") && strArr[i].equals("1")) count++;
                else if (strArr[i-1].equals("1") && strArr[i].equals("0")) count++;
            }
            
            System.out.println(count);
		}
	}
}