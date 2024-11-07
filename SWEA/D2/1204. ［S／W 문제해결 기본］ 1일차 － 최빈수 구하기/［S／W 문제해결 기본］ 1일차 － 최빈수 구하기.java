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
            int num = sc.nextInt();
            System.out.printf("#%d ",test_case);
            
            Map<Integer, Integer> scores = new HashMap<>(); // 점수, 개수
            for (int i=0;i<1000;i++) {
                int score = sc.nextInt();
                scores.put(score, scores.getOrDefault(score, 0)+1);
            }
            
            int maxStudentCount = 0; // 학생수 최대값
            int tempScore = 0; // 학생수 최대값의 점수 저장
            for (int key : scores.keySet()) {
                int value = scores.get(key);
                
                if (maxStudentCount < value) {
                    maxStudentCount = value;
                    tempScore = key;
                } else if (maxStudentCount == value) {
                    tempScore = Math.max(tempScore, key);
                }
            }
            
            System.out.println(tempScore);
		}
	}
}