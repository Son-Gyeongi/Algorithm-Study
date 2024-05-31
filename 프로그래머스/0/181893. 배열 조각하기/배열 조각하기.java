import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);
        
        for (int i=0;i<query.length;i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스 - 뒷부분을 자른다.
                answer = Arrays.copyOfRange(answer, 0, query[i]+1);
            } else {
                // 홀수 인덱스 - 앞부분을 자른다.
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}