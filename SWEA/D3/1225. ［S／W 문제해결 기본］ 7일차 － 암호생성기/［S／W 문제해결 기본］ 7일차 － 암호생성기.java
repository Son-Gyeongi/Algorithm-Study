import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int t = sc.nextInt();
            System.out.printf("#%d ",t);
            
            Queue<Integer> queue = new LinkedList<>();
            for (int i=0;i<8;i++) {
                queue.offer(sc.nextInt());
            }
            
            int minus = 1;
            boolean b = true;
            while (true) {
                for (int i=0;i<queue.size();i++) {
                    if (minus == 6) minus = 1;
                    int value = queue.poll();
                    
                    if (value - minus <= 0) {
                        queue.offer(0);   
                        b = false;
                        break;
                    }
                    
                    queue.offer(value - minus);              
                    minus++;
                }
                
                if (!b) break;
            }
            
            while (!queue.isEmpty()) System.out.print(queue.poll()+" ");
            
            System.out.println();
		}
	}
}