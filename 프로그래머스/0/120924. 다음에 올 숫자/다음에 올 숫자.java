class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int minus1 = common[1] - common[0];
            int minus2 = common[2] - common[1];
            
            if (minus1 == minus2) {
                // 등차수열
                answer = common[common.length-1] + minus1;
            } else {
                // 등비수열
                int mul = common[1]/common[0];
                answer = common[common.length-1] * mul;
            }
        
        return answer;
    }
}