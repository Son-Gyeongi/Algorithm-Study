import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <=10; test_case++)
		{
            int N = sc.nextInt();
            String str = sc.next();
            String[] duplication = {"00", "11", "22", "33", "44", "55", "66", "77", "88", "99"};
            
            while (true) {
                int length = str.length();
                
                for (int i=0;i<duplication.length;i++) str = str.replaceAll(duplication[i], "");
                
                if (length == str.length()) break;
            }
            
            System.out.println("#"+test_case+" "+str);
		}
	}
}