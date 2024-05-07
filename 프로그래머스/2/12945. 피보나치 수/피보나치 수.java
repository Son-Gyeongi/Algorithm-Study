import java.util.*;

class Solution {
    public int solution(int n) {
        int fibo = 0;
        int first = 0;
        int second = 1;
        
        for(int i=0;i<n-1;i++) {
            fibo = (first % 1234567 + second % 1234567) % 1234567;
            first = second % 1234567;
            second = fibo % 1234567;
        }
        
        return fibo;
    }
}