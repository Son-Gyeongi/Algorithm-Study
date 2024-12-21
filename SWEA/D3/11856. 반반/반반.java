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
            String S = sc.next();
            Map<String, Integer> map = new HashMap<>();
            
            for (int i=0;i<S.length();i++) {
                String input = ""+S.charAt(i);
                map.put(input, map.getOrDefault(input, 0)+1);
            }
            
            if (map.size() == 2) {
                int value = map.get(""+S.charAt(0));
                if (value == 2) {
                    System.out.println("Yes");
                    continue;
                }
            }
            
            System.out.println("No");
		}
	}
}