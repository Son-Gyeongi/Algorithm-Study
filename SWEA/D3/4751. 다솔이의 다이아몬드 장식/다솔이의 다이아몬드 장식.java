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
            String str = sc.next();
            int strLength = str.length();
            
            // 중간 문자열 조합
            StringBuilder middle = new StringBuilder();
            middle.append("#");
            for (int i=0;i<strLength;i++) {
                middle.append(".").append(str.charAt(i)).append(".").append("#");
            }
            
            int middleLength = middle.length();
            
            StringBuilder first = new StringBuilder(); // 첫 번째, 마지막 번째 문자열 조합
            StringBuilder second = new StringBuilder(); // 두 번째, 네 번째 문자열 조합
            if (strLength == 1) {
                first.append("..#..");
                second.append(".#.#.");
            }
            else {
                first.append("..");
                while (true) {
                    if (first.length() < middleLength-2) first.append("#");
                    if (first.length() < middleLength-2) first.append("...");
                    else break;
                }
                first.append("..");
                
                while (true) {
                    if (second.length() < middleLength-1) second.append(".");
                    if (second.length() < middleLength-1) second.append("#");
                    else break;
                }
                second.append(".");
            }
            
            System.out.println(first);
            System.out.println(second);
            System.out.println(middle);
            System.out.println(second);
            System.out.println(first);
		}
	}
}