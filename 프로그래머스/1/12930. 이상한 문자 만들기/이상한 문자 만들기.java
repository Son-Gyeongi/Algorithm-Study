class Solution {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        
        char[] chArr = s.toCharArray();
        int index = 0;
        for (int i=0;i<chArr.length;i++) {
            char c = chArr[i];
            
            if (c == ' ') {
                builder.append(' ');
                index = 0;
            }
            else {
                if (index%2==0) builder.append((""+c).toUpperCase());
                else builder.append((""+c).toLowerCase());
                
                index++;
            }
        }
        
        return builder.toString();
    }
}