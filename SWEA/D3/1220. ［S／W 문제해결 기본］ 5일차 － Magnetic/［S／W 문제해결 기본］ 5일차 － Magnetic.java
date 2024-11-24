import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ",test_case);
            
            int size = sc.nextInt();
            
            Map<Integer, List<Integer>> magnetics = new HashMap<>();
            
            for (int i=1;i<=100;i++) {
                for (int j=1;j<=100;j++) {
                    int input = sc.nextInt();
                    if (input != 0) {
                        List<Integer> magneticNum = magnetics.getOrDefault(j, new ArrayList<>());
                        magneticNum.add(input);
                        magnetics.put(j,magneticNum);
                    }
                }
            }
            
            int count = 0;
            for (Integer key : magnetics.keySet()) {
                List<Integer> value = magnetics.get(key);
                
                Stack<Integer> deadlock = new Stack<>();
                for (int i=0;i<value.size();i++) {
                    int mag = value.get(i);
                    
                    if (mag == 1) deadlock.push(mag);
                    else if (!deadlock.empty() && deadlock.peek() == 1 && mag == 2) {
                        count++;
                        deadlock.push(mag);
                    }
                }
            }
            
            System.out.println(count);
		}
	}
}