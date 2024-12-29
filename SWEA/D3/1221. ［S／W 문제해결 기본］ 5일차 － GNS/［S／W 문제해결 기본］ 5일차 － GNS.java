import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String testCount = sc.next();
            int N = sc.nextInt();
            int[] numArr = new int[N];
            Map<String, Integer> strToNum = new HashMap<>();
            strToNum.put("ZRO", 0); strToNum.put("ONE", 1); strToNum.put("TWO", 2); strToNum.put("THR", 3);
            strToNum.put("FOR", 4); strToNum.put("FIV", 5); strToNum.put("SIX", 6); strToNum.put("SVN", 7);
            strToNum.put("EGT", 8); strToNum.put("NIN", 9);
            
            Map<Integer, String> numToStr = new HashMap<>();
            numToStr.put(0, "ZRO"); numToStr.put(1, "ONE"); numToStr.put(2, "TWO"); numToStr.put(3, "THR");
            numToStr.put(4, "FOR"); numToStr.put(5, "FIV"); numToStr.put(6, "SIX"); numToStr.put(7, "SVN");
            numToStr.put(8, "EGT"); numToStr.put(9, "NIN");
            
            for (int i=0;i<N;i++) {
                String input = sc.next();
                numArr[i] = strToNum.get(input);
            }
            
            Arrays.sort(numArr);
            
            System.out.println("#"+test_case);
            for (int i=0;i<N;i++) System.out.print(" "+numToStr.get(numArr[i]));
            System.out.println();
		}
	}
}