class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i=1;i<food.length;i++) {
            int count;
            if (food[i] > 1) {
                count = food[i]/2;

                for (int j=0;j<count;j++) {
                    answer.append(i);
                }
                // answer.append(String.valueOf(i).repeat(Math.max(0, count))); 위 for문과 같다.
            }
        }

        String string = answer.toString();
        String reverse = answer.reverse().toString();

        return string + "0" + reverse;
    }
}