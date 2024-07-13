class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=2;i<=n;i++) {
            if (primeNumber(i)) answer++;
        }
        
        return answer;
    }
    
    public boolean primeNumber(int num) {
        int standard = (int) Math.sqrt(num);
        
        // 소수이면 true, 아니면 false
        for (int i=2;i<=standard;i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}