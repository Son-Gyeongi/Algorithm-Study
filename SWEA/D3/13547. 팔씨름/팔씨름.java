import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String answer = "";
            String results = sc.next();
            Map<String, Integer> ox = new HashMap<>();
            ox.put("o", 0);
            ox.put("x", 0);
            
            for (int i=0;i<results.length();i++) {
                String input = ""+results.charAt(i);
                ox.put(input, ox.get(input) + 1);
            }
            
            if (ox.get("o") >= 8 || ox.get("x") < 8) answer = "YES";
            else if (ox.get("x") >= 8) answer = "NO";
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}