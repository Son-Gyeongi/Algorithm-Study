import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        
        // 2~a까지 b로 나누었을 때 0이 나오면 그 몫으로 유한소수 판별하기
        for (int i=2; i<=a; i++) {
            if (a%i == 0 && b%i ==0) {
                a = a/i;
                b = b/i;
            }
        }
        
        if ( b == 1) return 1;
        
        // 약분한 b를 가져와서 2랑 5로 나누어지는 지 확인하기
        // 2와 5만 존재하는 지 확인하기
        while(b%2 == 0 || b%5 == 0) {
            if (b%2 == 0) b = b/2;
            if (b%5 == 0) b = b/5;
            
            if (b == 1) return 1;
        }
        
        return answer;
    }
}