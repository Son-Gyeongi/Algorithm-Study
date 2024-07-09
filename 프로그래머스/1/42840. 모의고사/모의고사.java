import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> ranking = new ArrayList<>();
        int[] score = new int[3];
        
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p1Ans = new int[answers.length];
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p2Ans = new int[answers.length];
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] p3Ans = new int[answers.length];
        
        // 1. answers 개수에 맞게 p1,p2,p3 값을 반복해서 맞춰줘야 함
        int index = 0;
        for (int i=0;i<p1Ans.length;i++) {
            p1Ans[i] = p1[index++];

            if (index == p1.length) index = 0;
        }
        
        index = 0;
        for (int i=0;i<p2Ans.length;i++) {
            p2Ans[i] = p2[index++];

            if (index == p2.length) index = 0;
        }
        
        index = 0;
        for (int i=0;i<p3Ans.length;i++) {
            p3Ans[i] = p3[index++];

            if (index == p3.length) index = 0;
        }
        
        System.out.println("p1Ans = " + Arrays.toString(p1Ans));
        System.out.println("p2Ans = " + Arrays.toString(p2Ans));
        System.out.println("p3Ans = " + Arrays.toString(p3Ans));
        
        // 2. 수포자들의 답과 정답 비교하기
        for (int i=0;i<p1Ans.length;i++) {
            if (p1Ans[i] == answers[i]) {
                score[0] += 1;
            }
        }
        
        for (int i=0;i<p2Ans.length;i++) {
            if (p2Ans[i] == answers[i]) {
                score[1] += 1;
            }
        }
        
        for (int i=0;i<p3Ans.length;i++) {
            if (p3Ans[i] == answers[i]) {
                score[2] += 1;
            }
        }
        
        System.out.println("score = " + Arrays.toString(score));
        
        // 3. score 배열에서 최대값 찾기
        int max = score[0];
        for (int i=1;i<score.length;i++) {
            max = Math.max(max, score[i]);
        }
        
        // 4. 찾은 최대값에 맞는 score 요소만 ranking 에 넣기
        for (int i=0;i<score.length;i++) {
            if (max == score[i]) ranking.add(i+1);
        }
        
        System.out.println("ranking = " + ranking);
        
        // 5. list를 int[] 배열로 바꾸기
        return ranking.stream().mapToInt(i->i).toArray();
    }
}