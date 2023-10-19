class Solution {
    public int solution(int n) {
        int answer = 0;
       
        for (int i=n;0<=i;i--) {
            if(i%2==0) answer += i;
        }
        
        return answer;
    }
}