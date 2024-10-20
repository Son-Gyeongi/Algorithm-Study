import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int test = sc.nextInt();
            String str = String.valueOf(test);
            
            // int 로 숫자를 받았을 때 앞자리에 0이 있는 경우 0이 사라진다. 이를 추가하기 위한 로직
            if (str.length() < 8) {
                String zeroAdd = "";
                
                for (int i =0 ;i<8-str.length();i++) {
                    zeroAdd += "0";
                }
                
                str = zeroAdd +str;
            }
            
            String year = str.substring(0, 4);
            String month = str.substring(4,6);
            String day = str.substring(6);
            
            int answer = 0;
            if (month.equals("01") || month.equals("03") || month.equals("05") || month.equals("07") ||
                month.equals("08") || month.equals("10") || month.equals("12")) {
                int dayInt = Integer.parseInt(day);
                if (0 >= dayInt || dayInt >= 32) {
                    answer = -1;
                }
            } else if (month.equals("04") || month.equals("06") ||
                        month.equals("09") || month.equals("11")) {
                int dayInt = Integer.parseInt(day);
                if (0 >= dayInt || dayInt >= 31) {
                    answer = -1;
                }
            } else if (month.equals("02")) {
                int dayInt = Integer.parseInt(day);
                if (0 >= dayInt || dayInt >= 29) {
                    answer = -1;
                }
            } else {
                answer = -1;
            }
            
            if (answer == 0) {
                String date = year+"/"+month+"/"+day;
                System.out.printf("#%d %s \n", test_case, date);
            } else {
                System.out.printf("#%d %d \n", test_case, answer);
            }
		}
	}
}