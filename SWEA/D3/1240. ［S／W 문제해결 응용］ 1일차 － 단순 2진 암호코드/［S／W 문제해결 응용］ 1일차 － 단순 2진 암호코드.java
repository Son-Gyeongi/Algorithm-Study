import java.util.Scanner;
import java.util.*;

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
            int M = sc.nextInt();
            
            String str = "";
            for (int i=0;i<N;i++) {
                String input = sc.next();
                
                if (input.contains("1") && str == "") str = input;
            }
            
            // 암호 코드에서 맨 끝 1이후에 0의 개수
            int count = 0;
            for (int i=str.length()-1;i>=0;i--) {
                String s = ""+str.charAt(i);
                if (s.equals("0")) count++;
                else break;
            }
            
            // 암호 코드 추출
            int index = M-(56+count);
            str = str.substring(index, index+56);
            
            // 암호 코드 추출 후 숫자로 변경
            Map<String, Integer> encode = new HashMap<>();
            encode.put("0001101",0);encode.put("0011001",1);encode.put("0010011",2);
            encode.put("0111101",3);encode.put("0100011",4);encode.put("0110001",5);
            encode.put("0101111",6);encode.put("0111011",7);encode.put("0110111",8);
            encode.put("0001011",9);
            
            String password = "";
            for (int i=0;i<str.length();i=i+7) {
                String s = str.substring(i,i+7);
                password+=encode.get(s);
            }
            
            // 암호 코드 숫자로 변경 후 올바른 지 계산
            String[] pw = password.split("");
            int odd = 0; int even = 0;
            for (int i=0;i<pw.length;i++) {
                if (i%2==0) odd += Integer.parseInt(pw[i]);
                else even += Integer.parseInt(pw[i]);
            }
            int cal = odd*3 + even;
            
            System.out.println(cal%10==0 ? odd+even : 0);
		}
	}
}