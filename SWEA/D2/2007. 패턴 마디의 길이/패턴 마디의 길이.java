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
            System.out.printf("#%d ", test_case);
            
            String inputStr = sc.next();
            int result = 0;
            
            for (int i=1;i<=inputStr.length();i++) {
                String standard = inputStr.substring(0,i);
                StringBuilder repeatStr = new StringBuilder();
                
                while (repeatStr.length() < inputStr.length()) {
                    repeatStr.append(standard);
                }
                
                String strToCompare = repeatStr.toString().substring(0,30);
                
                if (strToCompare.equals(inputStr)) {
                    result = i;
                    break;
                }
            }
            
            System.out.println(result);
		}
	}
}