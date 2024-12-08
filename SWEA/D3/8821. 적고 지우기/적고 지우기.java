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
            String str = sc.next();
            String[] arr = str.split("");
            
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<arr.length;i++) {
                Integer value = Integer.parseInt(arr[i]);
                if (list.contains(value)) list.remove(value);
                else list.add(value);
            }
            
            System.out.println(list.size());
		}
	}
}