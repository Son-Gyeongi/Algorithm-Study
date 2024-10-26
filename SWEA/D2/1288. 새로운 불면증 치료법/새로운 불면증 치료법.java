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
            System.out.printf("#%d ", test_case);
            int N = sc.nextInt();
            
            Set<Integer> numbers = new HashSet<>(); // 중복 없는 컬렉션
            
            int count = 1;
            while(true) {
                int mul = N*count;
                
                // mul 의 각 숫자를 Set 컬렉션에 넣기
                int mok = mul;
                while(mok != 0) {
                    numbers.add(mok%10);
                    mok = mok/10;
                }
                
                if (numbers.size() == 10) {
                    System.out.println(mul);
                    break;
                }
                count++;
            }
		}
	}
}