import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0;i<answer.length;i++) {
            answer[i] = findNumber(array, commands[i]);
        }
        
        return answer;
    }
    
    public int findNumber(int[] array, int[] command) {
        int[] arr = Arrays.copyOfRange(array, command[0]-1, command[1]);
        Arrays.sort(arr);
        
        return arr[command[2]-1];
    };
}