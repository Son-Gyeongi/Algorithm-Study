import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();

        Arrays.stream(myString.split("x"))
                .map(i -> answer.add(i.length())).toArray();

        if (myString.charAt(myString.length() -1) == 'x') answer.add(0);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}