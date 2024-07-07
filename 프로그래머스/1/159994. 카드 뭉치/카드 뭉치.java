import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        /*
        Queue<String> queue1 = new LinkedList<>();
        for (int i=0;i<cards1.length;i++) {
            queue1.add(cards1[i]);
        }
        */
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));

        /*
        Queue<String> queue2 = new LinkedList<>();
        for (int i=0;i<cards2.length;i++) {
            queue2.add(cards2[i]);
        }
        */
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));

        for (String s : goal) {
            // peek() 했을 때 null이 뜰 경우 NullPointerException 에러 남
            String str1 = queue1.isEmpty() ? "" : queue1.peek();
            String str2 = queue2.isEmpty() ? "" : queue2.peek();
            if (str1.equals(s) && !queue1.isEmpty()) {
                queue1.poll();
            } else if (str2.equals(s) && !queue2.isEmpty()) {
                queue2.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}