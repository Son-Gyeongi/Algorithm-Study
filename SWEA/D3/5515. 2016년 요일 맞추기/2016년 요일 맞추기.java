import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            Map<String, Integer> map = new HashMap<>();
            map.put("월",0); map.put("화",1); map.put("수",2);
            map.put("목",3); map.put("금",4); map.put("토",5); map.put("일",6);
            
            String[] day = {"목","금","토","일","월","화","수"}; // 월일의 모든 일 수를 더한 후 % 7 을 했을 때 나머지가 해당 월일의 요일이다.
            int[] month = {0,31,60,91,121,152,182,213,244,274,305,335,366};
            int m = sc.nextInt();
            int d = sc.nextInt();
            
            int sum = 0;
            sum += month[m-1]+d;
            int dayOfTheWeek = sum%7;
            
            System.out.println("#"+test_case+" "+map.get(day[dayOfTheWeek]));
		}
	}
}