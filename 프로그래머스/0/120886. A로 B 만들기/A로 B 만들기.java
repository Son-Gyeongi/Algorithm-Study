import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        String beforeStr = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String afterStr = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());

        return beforeStr.equals(afterStr) ? 1 : 0;
    }
}