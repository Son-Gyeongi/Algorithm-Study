import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int length = arr.length;
        
        // 배열의 길이를 가지고 2의 몇 제곱인지 찾아내기
        int pow = 0;
        for (int i=1;i<10;i++) {
            pow = (int) Math.pow(2, i);
            int powPlus = (int) Math.pow(2, i+1);
            if (pow < length && length < powPlus) {
                pow = powPlus;
                break;
            } else if (pow == length) {
                pow = pow;
                break;
            }
        }
        
        if (length == 1) {
            answer = Arrays.copyOf(arr, length);
        } else {
            answer = Arrays.copyOf(arr, pow);
        }
        
        return answer;
    }
}