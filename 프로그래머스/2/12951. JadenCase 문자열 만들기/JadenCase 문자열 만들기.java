class Solution {
    public String solution(String s) {
        StringBuilder answer =  new StringBuilder();
        String lowerAlphabet = s.toLowerCase();
        
        for (int i=0;i<lowerAlphabet.length();i++) {
            
            if (i == 0 && Character.isLowerCase(lowerAlphabet.charAt(0))) {
                answer.append(Character.toUpperCase(lowerAlphabet.charAt(0)));
                continue;
            }
            
            if (lowerAlphabet.charAt(i) == ' ') {
                answer.append(" ");
                continue;
            }
            
            if (i != 0 && lowerAlphabet.charAt(i-1) == ' ' && Character.isLowerCase(lowerAlphabet.charAt(i))) {
                answer.append(Character.toUpperCase(lowerAlphabet.charAt(i)));
                continue;
            }
            
            answer.append(lowerAlphabet.charAt(i));
        }
        
        return answer.toString();
    }
}