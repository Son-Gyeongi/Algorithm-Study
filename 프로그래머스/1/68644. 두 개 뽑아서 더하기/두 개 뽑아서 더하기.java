import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        Integer[] temp = {};
        
        // TreeSet 중복 없고 오름차순으로 저장
        Set<Integer> set = new TreeSet<>();
        
        for (int i=0;i<numbers.length-1;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        // Integer -> int 타입으로 바꾸기
        temp = set.toArray(temp);
        
        for (int i=0;i<temp.length;i++) {
            answer.add(temp[i]);
        }
        
        return answer.stream().mapToInt(s -> s).toArray();
    }
}