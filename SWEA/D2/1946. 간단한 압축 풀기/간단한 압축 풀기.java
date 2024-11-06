import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d \n",test_case);
            
            StringBuilder sb = new StringBuilder();
            int N = sc.nextInt();
            
            int count = 0;
            for (int i=0;i<N;i++) {
                String str = sc.next();
                int num = sc.nextInt();
                
                for (int j=0;j<num;j++) {
                    count++;
                    sb.append(str);
                    
                    if (count == 10) {
                        sb.append("\n");
                        count = 0;
                        continue;
                    }
                }
            }
            
            System.out.println(sb);
		}
	}
}