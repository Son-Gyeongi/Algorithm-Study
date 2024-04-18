import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        switch (n) {
            case 1 :
                return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            case 2 :
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3 :
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            case 4 :
                int[] array = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                int count = (int) IntStream.range(0, array.length).filter(a -> a % slicer[2] == 0).count();
                answer = new int[count];
                int j = 0;
                for (int i = 0; i < count; i++) {
                    answer[i] = array[j];
                    j += slicer[2];
                }
        }

        return answer;
    }
}