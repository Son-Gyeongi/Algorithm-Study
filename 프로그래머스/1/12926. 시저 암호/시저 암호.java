class Solution {
    public String solution(String s, int n) {
        char[] chArr = s.toCharArray();
        
        for (int i=0;i<chArr.length;i++) {
            if (chArr[i] == ' ') continue;
            int num = chArr[i] + n;
            if (('a'<=chArr[i] && chArr[i]<='z') && num > 'z') num -= 26;
            else if (('A'<=chArr[i] && chArr[i]<='Z') && num > 'Z') num -= 26;
            
            chArr[i] = (char) num;
        }
        
        return new String(chArr);
    }
}