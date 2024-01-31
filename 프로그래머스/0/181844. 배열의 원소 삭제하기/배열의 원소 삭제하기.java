import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>(arr.length);

        // int 배열을 Integer 리스트로 변환
        for (int value : arr) {
            list.add(value);
        }

        for (int delete : delete_list) {
            for (int j = 0; j < list.size(); j++) {
                if (delete == list.get(j)) {
                    list.remove(j);
                }
            }
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}