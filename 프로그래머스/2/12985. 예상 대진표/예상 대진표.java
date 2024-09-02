class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int min = Math.min(a,b);
        int max = Math.max(a,b);

        // 경우의 수 1라운드 (a-b) -> 1-2,3-4,5-6 ... 반환값 1 (테스트 케이스 1, 26 통과)
        if (max % 2 == 0 && min == max-1) return 1;
        
        // 테스트 케이스 2,3,4,5,11,12,13,14,15,16,17,33,34 통과
        answer = vs(0, min, max);
        
        return answer;
    }
    
    public int vs(int sum, int a, int b) {
        if (b % 2 == 0 && a == b-1) return sum+=1;
        
        int newA = 0;
        int newB = 0;
        
        if (a % 2 == 1 && b % 2 == 1) {
            // a 홀수인 경우, b 홀수인 경우
            newA = a / 2 + 1;
            newB = b / 2 + 1;
        } else if (a % 2 == 1 && b % 2 == 0) {
            // a 홀수인 경우, b 짝수인 경우
            newA = a / 2 + 1;
            newB = b / 2;
        } else if (a % 2 == 0 && b % 2 == 1) {
            // a 짝수인 경우, b 홀수인 경우
            newA = a / 2;
            newB = b / 2 + 1;
        } else if (a % 2 == 0 && b % 2 == 0) {
            // a 짝수인 경우, b 짝수인 경우
            newA = a / 2;
            newB = b / 2;
        }
        
        return vs(sum+1, newA, newB);
    }
}