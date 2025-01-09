import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ",test_case);
            String[] current = sc.next().split(":");
            String[] promise = sc.next().split(":");
            int[] divide = {3600, 60, 1}; // 초로 된 숫자를 나눌 때 시,분,초 로 나올 수 있다.
            
            int c = (Integer.parseInt(current[0])*60*60) + (Integer.parseInt(current[1])*60) +Integer.parseInt(current[2]);
            int p = (Integer.parseInt(promise[0])*60*60) + (Integer.parseInt(promise[1])*60) +Integer.parseInt(promise[2]);
            int result = p-c >= 0 ? p-c : 86400 + (p-c); // 86400 => 24:00:00
            
            for (int i=0;i<divide.length;i++) {
                System.out.printf("%02d%s", result/divide[i], i==2 ? "\n" : ":");
                
                result %= divide[i];
            }
		}
	}
}