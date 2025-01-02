import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int N = sc.nextInt();
            List<Integer> numbers = new ArrayList<>();

            for (int i=0;i<N;i++) numbers.add(sc.nextInt());

            int commands = sc.nextInt();
            
            for (int i=0;i<commands;i++) {
                String command = sc.next();
                int index = sc.nextInt();
                int count = sc.nextInt();
                
                if (command.equals("I")) {
                    for (int j=0;j<count;j++) numbers.add(j+index, sc.nextInt());
                } else if (command.equals("D")) {
                    for (int k=0;k<count;k++) numbers.remove(index);
                }
            }
            
            System.out.print("#"+test_case);
            for (int i=0;i<10;i++) System.out.print(" "+numbers.get(i));
            System.out.println();
		}
	}
}