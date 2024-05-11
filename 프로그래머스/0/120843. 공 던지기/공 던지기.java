import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int[] even = new int[numbers.length/2];
        int[] odd = new int[numbers.length];
        int j =0;

        // 1. 규칙 찾기
        // 2. 찾은 규칙으로 배열 만들기
        if (numbers.length % 2 == 0) {
            // 배열이 짝수인 경우
            for (int i=0;i<even.length;i++) {
                even[i] = numbers[j];
                j+=2;
            }

            // 3. k-1 번째 값 반환
            return even[(k - 1) % even.length];
        } else {
            // 배열이 홀수인 경우
            for (int i=0;i<odd.length;i++) {
                odd[i] = numbers[j];

                if (j == numbers.length - 1) {
                    j = 1;
                    continue;
                }
                j+=2;
            }

            // 3. k-1 번째 값 반환
            return odd[(k - 1) % odd.length];
        }
    }
}