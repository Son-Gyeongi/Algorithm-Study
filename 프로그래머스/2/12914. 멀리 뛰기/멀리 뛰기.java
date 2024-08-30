class Solution {
    public long solution(int n) {
        long answer = 0;
        
        if (n == 1) return 1;
        else if (n == 2) return 2;
        
        answer = pibo(n, 3, 1, 2);
        
        return answer%1234567;
    }
    
    public long pibo(int n, long count, long past_sum, long present_sum) {
        long temp = present_sum;
        present_sum = (past_sum + present_sum)%1234567;
        past_sum = temp;
        
        if (count == n) return present_sum;
        
        return pibo(n, count+1, past_sum, present_sum);
    }
}