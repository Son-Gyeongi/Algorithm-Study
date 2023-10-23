class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int arrLen = num_list.length -1;
        
        for (int i=0; i<=arrLen ; i++) {
            answer[i] = num_list[arrLen - i];
        }
        
        return answer;
    }
}