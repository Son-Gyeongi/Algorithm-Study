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
            
            int N = sc.nextInt(); // 학생 수
            int k = sc.nextInt(); // 학생 번호
            
            // 학생 점수 계산해서 Map 에 넣기 <학생 번호, 점수>
            Map<Integer, Double> studentScores = new HashMap<>();
            Set<Double> scores = new TreeSet<>(Collections.reverseOrder()); // 상대평가니깐 순서를 세워야 한다.
            for (int i=1;i<=N;i++) {
                double middleScore = sc.nextInt();
                double finalScore = sc.nextInt();
                double assignmentScore = sc.nextInt();
                
                double totalScore = (middleScore*0.35) + (finalScore*0.45) + (assignmentScore*0.2);
                
                studentScores.put(i, totalScore);
                scores.add(totalScore);
            }
            
            // 학생의 순위 알아보기
            double targetScore = studentScores.get(k); // 주어진 학생 번호에 맞는 점수 가져옴
            int rank = 0; // 순위
            for (double score : scores) {
                if (targetScore == score) break;
                rank++; // 순위를 성적으로 매길 때 편하게 나오기 위해 등수를 0부터 시작
            }
            
            // 순위로 성적 매기기
            String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            int numberOfPeoplePerGrade = N/10; // 성적당 인원
            int gradeIndex = rank/numberOfPeoplePerGrade;
            
            System.out.println(grade[gradeIndex]);
		}
	}
}