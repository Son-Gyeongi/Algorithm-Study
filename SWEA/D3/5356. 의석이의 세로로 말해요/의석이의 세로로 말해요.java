import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String[] strArr = new String[15];
            for (int i=0;i<strArr.length;i++) strArr[i] = "";
            
            for (int i=0;i<5;i++) {
                String[] input = sc.next().split("");
                for (int j=0;j<input.length;j++) strArr[j] += input[j];
            }
            
            System.out.println("#"+test_case+" "+String.join("",strArr));
		}
	}
}