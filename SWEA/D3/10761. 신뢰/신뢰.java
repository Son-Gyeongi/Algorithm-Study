import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            String[] strArr = new String[n];
            List<Integer> oList = new ArrayList<>();
            List<Integer> bList = new ArrayList<>();
            
            for (int i=0;i<n;i++) {
                String str = sc.next();
                int m = sc.nextInt(); // 미터
                strArr[i] = str+" "+m;
                
                if (str.equals("O")) oList.add(m);
                else if (str.equals("B")) bList.add(m);
            }
            
            int count = 0, index = 0;
            int oM = 1, bM = 1;
            while (true) {
                if (index == strArr.length) break;
                
                count++; // 초
                String currentStr = strArr[index].split(" ")[0];
                int currentM = Integer.parseInt(strArr[index].split(" ")[1]);
                
                if (currentStr.equals("B")) {
                    if (!bList.isEmpty()) {
                        if (bM==bList.get(0)) {
                            // 버튼 누름
                            bList.remove(0);
                            // 눌렀으니깐 새로운 명령을 들고온다.
                            index++;
                        } 
                        else if (bM < bList.get(0)) bM++;
                        else if (bM > bList.get(0)) bM--;
                    }
                    
                    if (!oList.isEmpty()) {
                        if (oM < oList.get(0)) oM++;
                        else if (oM > oList.get(0)) oM--;
                    }
                } else if (currentStr.equals("O")) {
                    if (!oList.isEmpty()) {
                        if (oM==oList.get(0)) {
                            // 버튼 누름
                            oList.remove(0);
                            // 눌렀으니깐 새로운 명령을 들고온다.
                            index++;
                        }
                        else if (oM < oList.get(0)) oM++;
                        else if (oM > oList.get(0)) oM--;
                    }
                    
                    if (!bList.isEmpty()) {
                        if (bM < bList.get(0)) bM++;
                        else if (bM > bList.get(0)) bM--;
                    }
                }
            }
            
            System.out.println("#"+test_case+" " +count);
		}
	}
}