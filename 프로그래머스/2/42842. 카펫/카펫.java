import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        // 카펫 가로 길이 >= 카펫 세로 길이
        int[] answer = new int[2];
        
        // 노란색 칸이 1줄인지 2줄인지 3줄인지 찾기
        
        
        if ((yellow+2)*3-yellow == brown) {
            // 노란색 칸이 길쭉한 형태로 있다.
            
            return new int[]{yellow+2, 3}; // 가로, 세로
        }
        
        List<Integer> divisors = new ArrayList<>(); // yellow 약수들을 오름차순으로 저장
        findingDivisors(brown, yellow, divisors); // yellow 약수 구하기
        
        // 약수의 값이 yellow 줄의 수다. 그래서 각 값 중에 brown이 나올 수 있는 경우 반환
        for (int i=0;i<divisors.size();i++) {
            int yellowLength = divisors.get(i);
            int yellowWidth = yellow/yellowLength;
            
            // yellow 줄 수를 보고 brown 개수랑 일치하는지 확인
            if ((yellowWidth+2)*2 + yellowLength*2 == brown) {
                
                return new int[]{yellowWidth+2, yellowLength+2}; // 가로, 세로
            }
        }
        
        return answer;
    }
    
    // yellow 약수 구하기
    public void findingDivisors(int brown, int yellow, List<Integer> divisors) {
        
        for (int i=1;i<=yellow/2;i++) {
            if (yellow%i == 0) divisors.add(i);
        }
        
        divisors.add(yellow);
    }
}