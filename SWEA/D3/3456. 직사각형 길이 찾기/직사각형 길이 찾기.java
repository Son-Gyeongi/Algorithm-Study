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
            
            Map<Integer, Integer> map = new HashMap<>();
            for (int i=0;i<3;i++) {
                int input = sc.nextInt();
                int value = map.getOrDefault(input, 0);
                map.put(input, value+1);
            }
            
            for (Integer key : map.keySet()) {
                int value = map.get(key);
                
                if (value == 3 || value == 1) {
                    System.out.println(key);
                    break;
                }
            }
		}
	}
}