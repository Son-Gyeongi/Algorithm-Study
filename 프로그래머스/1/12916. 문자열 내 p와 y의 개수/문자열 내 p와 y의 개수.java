class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        s = s.toUpperCase();
        
        for (char c : s.toCharArray()) {
            if (c == 'P') p++;
            else if (c == 'Y') y++;
        }
        
        return (p==0&&y==0) || p == y;
    }
}