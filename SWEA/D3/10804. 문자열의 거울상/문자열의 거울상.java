import java.util.Scanner;
import java.util.*;

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
            Map<String, String> converse = new HashMap<>();
            converse.put("p","q");
            converse.put("q","p");
            converse.put("b","d");
            converse.put("d","b");
            
            String input = sc.next();
            StringBuilder result = new StringBuilder();
            
            for (int i=input.length()-1;i>=0;i--) {
                String tmp = ""+input.charAt(i);
                String str = converse.get(tmp);
                result.append(str);
            }
            
            System.out.println(result);
		}
	}
}