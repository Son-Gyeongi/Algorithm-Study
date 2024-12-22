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
            int dumpCount = sc.nextInt();
            int[] array = new int[100];
            
            for (int i=0;i<100;i++) array[i] = sc.nextInt();
            Arrays.sort(array);
            
            for (int i=0;i<dumpCount;i++) {
                if (array[0] == array[99]) break;
                
                array[0]++;
                array[99]--;
                Arrays.sort(array);
            }
            
            System.out.println(array[99]-array[0]);
		}
	}
}