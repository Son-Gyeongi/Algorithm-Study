import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] arr = new int[array.length];
        
        // array 배열의 각 요소에서 n 값을 뺀 것을 arr 배열에 저장하기
        int min = Math.abs(array[0] - n);
        for (int i=0;i<array.length;i++) {
            arr[i] = Math.abs(array[i] - n);
            
            min = Math.min(min, arr[i]);
        }
        
        int temp = 0;
        for (int i=0;i<array.length;i++) {
            if(min == arr[i]) {
                // 가장 가까운 수가 여러 개일 경우 더 작은 수 구하기
                if (temp == 0)
                    temp = array[i];
                answer = Math.min(temp, array[i]);
            }
        }
        
        return answer;
    }
}