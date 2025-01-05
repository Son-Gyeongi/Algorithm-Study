import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String input = sc.next();
            Map<String, Integer> map = new HashMap<>();
            List<String> list = new ArrayList<>();
            
            for (int i=0;i<input.length();i++) {
                String str = input.charAt(i)+"";
                map.put(str, map.getOrDefault(str, 0)+1);
            }
            
            for (String key : map.keySet()) {
                int value = map.get(key);
                
                if (value%2!=0) list.add(key);
            }
            
            Collections.sort(list);
            System.out.printf("#%d ",test_case);
            
            if (list.size() == 0) System.out.println("Good");
            else {
                for (int i=0;i<list.size();i++) System.out.print(list.get(i));
                System.out.println();
            }
		}
	}
}