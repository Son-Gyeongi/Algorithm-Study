class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int tmp = 0;
        int arrLen = num_list.length -1;
        
        for (int i=0; i<=arrLen ; i++) {
            tmp = num_list[i];
            answer[i] = num_list[arrLen - i];
            answer[arrLen - i] = tmp;
        }
        
        return answer;
    }
}