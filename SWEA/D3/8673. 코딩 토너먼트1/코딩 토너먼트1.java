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
            
            int K = sc.nextInt();
            int people = (int) Math.pow(2,K);
            
            List<Integer> skills = new ArrayList<>();
            for (int i=0;i<people;i++) {
                skills.add(sc.nextInt());
            }
            
            int sum = 0;
            for (int i=0;i<skills.size();i=i+2) {
                if (i == skills.size()-1) break;
                
                int a = skills.get(i);
                int b = skills.get(i+1);
                
                if (a >= b) {
                    sum += (a-b);
                    skills.add(a);
                } else {
                    sum += (b-a);
                    skills.add(b);
                }
            }
            
            System.out.println(sum);
		}
	}
}