import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Integer[] temp = {};

        // 중복 없고 순서
        Set<Integer> setArr = new LinkedHashSet<>();

        for (int a : arr) {
            setArr.add(a);
        }

        temp = setArr.toArray(temp);

        for (int i = 0; i < k; i++) {
            if (i >= temp.length) {
                answer[i] = -1;
                continue;
            }
            answer[i] = temp[i];
        }

        return answer;
    }
}