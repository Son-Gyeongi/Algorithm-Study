import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int answer = 0;
            String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
            String[] str = sc.next().split("");
            
            if (!str[0].equals("a")) answer = 0;
            else {
                for (int i=0;i<alphabet.length;i++) {
                    if (i == str.length) break;
                    
                    if (alphabet[i].equals(str[i])) answer++;
                    else break;
                }
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}