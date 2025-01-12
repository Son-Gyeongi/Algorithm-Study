import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int M = sc.nextInt(); // 2진수로 바꿔야할 값
            String answer = "ON";
            String binary = Integer.toBinaryString(M);
            
            if (M == 0 || binary.length() < N) {
                System.out.println("#"+test_case+" OFF");
                continue;
            }
            
            for (int i=binary.length()-N;i<binary.length();i++) {
                if (binary.charAt(i) == '0') answer = "OFF";
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}