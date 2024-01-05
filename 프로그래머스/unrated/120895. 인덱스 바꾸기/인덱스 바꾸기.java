import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        String[] strArr = my_string.split("");

        String tmp = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = tmp;

        answer = Arrays.stream(strArr).collect(Collectors.joining());

        return answer;
    }
}