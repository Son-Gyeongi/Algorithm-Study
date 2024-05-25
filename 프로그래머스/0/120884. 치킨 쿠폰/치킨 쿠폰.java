import java.util.*;

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int mokSum = 0; // 치킨 수
        int namSum = 0;
        
        int mok = chicken;
        while(mok > 9) {
            namSum += (mok % 10);
            mok = mok / 10;
            mokSum += mok;
        }
        
        namSum += mok;
        
        if ((namSum/10)+(namSum%10) > 9 ) answer += 1;
        
        answer += mokSum + (namSum / 10);
        
        return answer;
    }
}