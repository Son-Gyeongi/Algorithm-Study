class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=4;i<=n;i++) {
            if (compositeNumber(i)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    // 합성수를 찾기
    public static boolean compositeNumber(int n) {
        int count = 0;
        for (int i=1;i<=100;i++) {
            if (n%i == 0) {
                count++;
            }
        }
        
        return count >=3 ? true : false;
    }
}