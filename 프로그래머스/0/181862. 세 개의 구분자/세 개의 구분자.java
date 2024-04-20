import java.util.Arrays;
import java.util.Objects;

class Solution {
    public String[] solution(String myStr) {
        String[] splitStr = myStr.split("[abc]");
        String[] answer = Arrays.stream(splitStr).filter(str -> !Objects.equals(str, ""))
                .toArray(String[]::new);

        if (answer.length == 0) return new String[]{"EMPTY"};

        return answer;
    }
}