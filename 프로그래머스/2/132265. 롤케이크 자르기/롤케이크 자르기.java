import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int[] olderTopping = new int[topping.length-1];
        int[] youngerTopping = new int[topping.length-1];
        Set<Integer> oSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        
        int count = 0;
        for (int i=0;i<topping.length-1;i++) {
            if (oSet.contains(topping[i])) {
                olderTopping[i] = count;
            } else {
                count++;
                olderTopping[i] = count;
                oSet.add(topping[i]);
            }
        }
        
        count = 0;
        for (int i=topping.length-1,j=topping.length-2;i>0;i--,j--) {
            if (ySet.contains(topping[i])) {
                youngerTopping[j] = count;
            } else {
                count++;
                youngerTopping[j] = count;
                ySet.add(topping[i]);
            }
        }
        
        // 중복 제거한 토핑의 개수가 같으면 공평하게 나누어진 것이다.
        for (int i=0;i<olderTopping.length;i++)
            if (olderTopping[i]==youngerTopping[i]) answer++;
        
        return answer;
    }
}