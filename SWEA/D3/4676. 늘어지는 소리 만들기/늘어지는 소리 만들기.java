import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String str = sc.next();
            String[] strArr = new String[str.length()+1];
            strArr[0] = "";
            
            for (int i=0;i<str.length();i++) strArr[i+1] = ""+str.charAt(i);
            
            int H = sc.nextInt();
            
            for (int i=0;i<H;i++) {
                int idx = sc.nextInt();
                strArr[idx] += "-";
            }
            
            System.out.println("#"+test_case+" "+String.join("",strArr));
		}
	}
}