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
            String number = sc.next();
            String[] numArr = number.split("");
            Set<Integer> unique = new HashSet<>();
            
            for (int i=0;i<numArr.length;i++) {
                int n = Integer.parseInt(numArr[i]);
                unique.add(n);
            }
            
            System.out.println(unique.size());
		}
	}
}