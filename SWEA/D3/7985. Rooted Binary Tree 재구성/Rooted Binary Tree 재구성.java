import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ", test_case);
            int floor = sc.nextInt();
            String[] original = new String[floor];
            Arrays.fill(original, "");
            List<Integer> list = new ArrayList<>();
            
            int element = (int)Math.pow(2,floor);
            for (int i=1;i<element;i++) list.add(sc.nextInt());
            
            for (int i=original.length-1;i>=0;i--) {
                for (int j=0;j<list.size();j+=2) original[i] += j==0 ? ""+list.get(j) : " "+list.get(j);
                
                for (int x=list.size()-1;x>=0;x-=2) list.remove(x);
            }
            
            for (String str : original) System.out.println(str);
		}
	}
}