import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];
        int[] ranking = new int[score.length];
        
        for (int i=0;i<score.length;i++) {
            avg[i] += (score[i][0] + score[i][1])/2.0;
        }
        
        System.out.println(Arrays.toString(avg));
        
        int count = 1;
        for (double i=100;i >= 0; i= i-0.5) {
            int num = 0;
            for (int j=0;j<avg.length;j++) {
                if (avg[j] == i) {
                    ranking[j] = count;
                    num++;
                }
            }
            
            if (num >= 1) count += num;
        }
        
        System.out.println(Arrays.toString(ranking));
        
        return ranking;
    }
}