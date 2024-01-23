import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .map(str -> str.substring(s, s + l))
                .filter(i -> k < Integer.parseInt(i))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}