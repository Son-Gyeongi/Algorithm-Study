class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++) {
            max = Math.max(max, arr[i]);
        }
        
        for (int i=2;i<=max;i++) {
            int count = 0;
            
            for (int j=0;j<arr.length;j++) {
                if (arr[j] % i == 0) {
                    count++;
                }
            }
            
            while (count >= 2) {
                count = 0;
                answer *= i;
                
                for (int j=0;j<arr.length;j++) {
                    if (arr[j] % i == 0) {
                        arr[j] = arr[j] / i;
                    }
                }
                
                for (int j=0;j<arr.length;j++) {
                    if (arr[j] % i == 0) {
                        count++;
                    }
                }
            }
        }
        
        for (int i=0;i<arr.length;i++) {
            answer *= arr[i];
        }
        
        return answer;
    }
}