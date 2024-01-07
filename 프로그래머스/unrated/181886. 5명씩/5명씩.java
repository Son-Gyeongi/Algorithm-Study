import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] names) {
        return IntStream.range(0, names.length).filter(i -> i % 5 == 0)
                .mapToObj(i -> names[i])
                .toArray(String[]::new); // IntStream요소가 문자열 배열로 변경됨
    }
}