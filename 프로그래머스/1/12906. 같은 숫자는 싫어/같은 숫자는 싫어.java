import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int num = arr[0]; // 연속된 수 저장
        // 연속된 숫자 제거
        for(int i=0;i<arr.length;i++){
            if(num != arr[i]) {
                answer.add(num);
                num = arr[i];
            }
        }
        answer.add(num);

        return answer.stream().mapToInt(a -> a).toArray();
    }
}