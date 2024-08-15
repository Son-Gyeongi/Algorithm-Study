class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<sArr.length;i++) {
            max = Math.max(max, Integer.parseInt(sArr[i]));
            min = Math.min(min, Integer.parseInt(sArr[i]));
        }
        
        return min + " " + max;
    }
}