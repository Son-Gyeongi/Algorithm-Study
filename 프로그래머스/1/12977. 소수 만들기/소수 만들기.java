class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i=0;i<nums.length-2;i++) {
            int a = nums[i];
            
            for (int j=i+1;j<nums.length-1;j++) {
                int b = nums[j];
                
                for (int k=j+1;k<nums.length;k++) {
                    int c = nums[k];
                    int sum = a + b + c;
                
                    if (primeNumber(sum)) answer++;
                }
            }
        }

        return answer;
    }
    
    public boolean primeNumber(int primeNumber) {
        // primeNumber가 소수면 true, 아니면 false
        for (int i=2;i<primeNumber;i++) {
            if (primeNumber % i == 0) return false;
        }
        
        return true;
    }
}