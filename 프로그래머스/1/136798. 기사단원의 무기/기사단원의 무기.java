class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisorCnt = new int[number];
        
        // 1. 각 number 들의 약수 구하고 그 개수를 배열(divisorCnt)에 넣기
        for (int i=0;i<number;i++) {
            divisorCnt[i] = divisorCount(i+1);
        }
        
        // 2. 약수 개수의 배열(divisorCnt)을 하나씩 보면서 limit 보다 초과한 숫자는 power 수로 바꾸기
        for (int i=0;i<divisorCnt.length;i++) {
            if (divisorCnt[i] > limit) divisorCnt[i] = power;
            
            // 3. 약수 개수의 배열(divisorCnt) 다 더하기
            answer += divisorCnt[i];
        }
        
        return answer;
    }
    
    // number의 약수 개수 구하기
    public int divisorCount(int number) {
        /*
        약수
        6 -> 1,2,3,6
        8 -> 1,2,4,8
        => 1과 자기자신의 수를 빼면 6/2, 8/2 이하의 수에서 값이 나온다.
        6은 3이하 -> 2,3
        8은 4이하 -> 2,4
        */
        
        if (number == 1) return 1;
        
        int sum = 2; // 1은 모든 숫자에 다 들어가서 미리 포함시킴, number도 당연히 포함되서 +1 했음
        
        // 2부터 number까지 계산해서 약수를 구하면 시간 초과나서 아래와 같이 계산함
        // 2부터 number/2까지 나누었을 때 나머지가 0이면 number의 약수이다.
        for (int i=2;i<=number/2;i++) {
            if (number % i == 0) sum++;
        }
        
        return sum;
    }
}