import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;
        
        int row = arr.length;
        int column = arr[0].length;
        
        int min = Math.min(row, column);
        int max = Math.max(row, column);
        
        answer = new int[max][max];
        
        for (int i=0;i<answer.length;i++) {
            for (int j=0;j<answer[i].length;j++) {
                if (i < row && j < column) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}