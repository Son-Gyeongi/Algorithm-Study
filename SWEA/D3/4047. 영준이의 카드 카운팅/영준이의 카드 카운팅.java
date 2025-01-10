import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String cards = sc.next();
            Set<String> set = new HashSet<>();
            int s=13,d=13,h=13,c=13;
            int count = 0; // 영준이가 가지고 있는 카드 수
            
            for (int i=0;i<cards.length()-2;i+=3) {
                count++;
                set.add(""+cards.charAt(i)+cards.charAt(i+1)+cards.charAt(i+2));
                
                if (cards.charAt(i) == 'S') s--;
                else if (cards.charAt(i) == 'D') d--;
                else if (cards.charAt(i) == 'H') h--;
                else c--;
            }
            
            if (set.size() != count) System.out.println("#"+test_case+" ERROR");
            else System.out.printf("#%d %d %d %d %d\n",test_case,s,d,h,c);
		}
	}
}