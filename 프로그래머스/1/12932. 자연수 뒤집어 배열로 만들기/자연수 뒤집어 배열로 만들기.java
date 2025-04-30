class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String reverseStr = new StringBuilder(str).reverse().toString();
        char[] chArr = reverseStr.toCharArray();
        
        int[] answer = new int[chArr.length];
        for (int i=0;i<answer.length;i++) {
            answer[i] = chArr[i] - '0';
        }
        
        return answer;
    }
}