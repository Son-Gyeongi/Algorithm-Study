class Solution {
    public int[] solution(int[] answers) {
        int[][] math = {
            {1,2,3,4,5}, // 5개
            {2,1,2,3,2,4,2,5}, // 8개
            {3,3,1,1,2,2,4,4,5,5} // 10개
        };
        int[] count = new int[math.length];
        int max=0;
        
        for (int i=0;i<answers.length;i++) {
            for (int j=0;j<math.length;j++) {
                if (answers[i] == math[j][i%math[j].length]) count[j]++;
                max = Math.max(max, count[j]);
            }
        }
        
        int length=0;
        for (int i=0;i<count.length;i++) {
            if (max == count[i]) length++;
        }
        
        int[] answer = new int[length];
        int index = 0;
        for (int i=0;i<count.length;i++) {
            if (max == count[i]) answer[index++] = i+1;
        }
        return answer;
    }
}