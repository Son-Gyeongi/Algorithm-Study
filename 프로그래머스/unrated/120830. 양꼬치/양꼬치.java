class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int yang = 12000 * n; //양꼬치 값
        int coke; // 음료 값
        int free = n / 10; // 무료 음료
        
        coke = 2000 * (k-free);
        answer = yang + coke;
        return answer;
    }
}