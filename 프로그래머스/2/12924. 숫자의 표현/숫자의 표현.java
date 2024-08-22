class Solution {
    public int solution(int n) {
        int answer = 1;
        
        // 일단 자기자신 기본적으로 +1
        // 1부터 n의 절반까지 계산 n/2
        
        for (int i=1;i<(n/2+1);i++) {
            int sum = i;
            
            for (int j=i+1;j<(n/2+2);j++) {
                sum += j;
                
                if (sum == n) {
                    answer++;
                } else if (sum > n) break;
            }
        }
        
        return answer;
    }
}