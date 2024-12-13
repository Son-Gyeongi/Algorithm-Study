import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            System.out.printf("#%d ", test_case);
            
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<N;i++) list.add(sc.nextInt());
            
            int C = sc.nextInt();
            for (int i=0;i<C;i++) {
                String command = sc.next();
                
                if (command.equals("I")) {
                    int index = sc.nextInt();
                    int count = sc.nextInt();
                    
                    for (int j=0;j<count;j++) list.add(index+j, sc.nextInt());
                }
            }
            
            for (int i=0;i<10;i++) System.out.printf("%d ",list.get(i));
            System.out.println();
		}
	}
}