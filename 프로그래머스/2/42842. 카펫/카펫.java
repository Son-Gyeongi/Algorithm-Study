class Solution {
    public int[] solution(int brown, int yellow) {
        // x 가로, y 세로 (x>=y)
        int xy = brown+yellow;
        int x=0,y=0;
        
        for (int i=3;;i++) {
            x = i;
            if (xy%i==0) y=xy/i;
            else continue;
            
            if ((x*2+(y-2)*2)!=brown) continue;
            
            if (x >= y) break;
        }
        
        int[] answer = {x, y};
        return answer;
    }
}