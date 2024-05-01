import java.util.*;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0;i<number.length-1;i++) {
            sum = number[i];
            
            for(int j=i+1;j<number.length;j++) {
                int tmp = sum + number[j];
                for(int a= j+1;a<number.length;a++) {
                    int temp = tmp + number[a];
                    if (temp == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}