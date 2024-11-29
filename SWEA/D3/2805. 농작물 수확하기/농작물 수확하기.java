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
            System.out.printf("#%d ",test_case);
            
            int N = sc.nextInt();
            int limitDown = N/2;
            int limitUp = N/2;
            int sum = 0;
            
            for (int i=0;i<N;i++) {
                String number = sc.next();
                String[] numSplit = number.split("");
                
                for (int j=limitDown;j<=limitUp;j++) sum += Integer.parseInt(numSplit[j]);
                
                if (i >= N/2) {
                    limitDown = limitDown + 1;
                	limitUp = limitUp - 1;
                } else {
                    limitDown = limitDown - 1;
                	limitUp = limitUp + 1;
                }
            }
            
            System.out.println(sum);
		}
	}
}