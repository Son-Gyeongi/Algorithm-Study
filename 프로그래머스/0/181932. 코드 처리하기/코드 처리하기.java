class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        String[] strArr = code.split("");
        
        for (int i=0;i<strArr.length;i++) {
            if (strArr[i].equals("1")) {
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            
            if (mode == 0 && i % 2 == 0) {
                answer += strArr[i];
            } else if (mode == 1 && i % 2 == 1) {
                answer += strArr[i];
            }
        }
        
        if (answer.length() == 0) answer = "EMPTY";
        
        return answer;
    }
}