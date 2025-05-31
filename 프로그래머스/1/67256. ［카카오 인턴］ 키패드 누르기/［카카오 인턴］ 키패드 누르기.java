import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        Map<String, Integer[]> map = new HashMap<>();
        map.put("1",new Integer[]{0,0});map.put("2",new Integer[]{0,1});map.put("3",new Integer[]{0,2});
        map.put("4",new Integer[]{1,0});map.put("5",new Integer[]{1,1});map.put("6",new Integer[]{1,2});
        map.put("7",new Integer[]{2,0});map.put("8",new Integer[]{2,1});map.put("9",new Integer[]{2,2});
        map.put("*",new Integer[]{3,0});map.put("0",new Integer[]{3,1});map.put("#",new Integer[]{3,2});
        
        String answer = "";
        String tempR = "#";
        String tempL = "*";
        
        for (int i=0;i<numbers.length;i++) {
            int num = numbers[i];
            
            if (num == 1 || num == 4 || num == 7) {
                tempL = String.valueOf(num);
                answer += "L";
            } else if (num == 3 || num == 6 || num == 9) {
                tempR = String.valueOf(num);
                answer += "R";
            } else {
                // 거리 계산
                Integer[] r = map.get(tempR);
                Integer[] l = map.get(tempL);
                Integer[] n = map.get(String.valueOf(num));
                
                int diffR = Math.abs(r[0] - n[0])
                    + Math.abs(r[1] - n[1]);
                int diffL = Math.abs(l[0] - n[0])
                    + Math.abs(l[1] - n[1]);
                
                if (diffR < diffL) {
                    tempR = String.valueOf(num);
                    answer += "R";
                } else if (diffR > diffL) {
                    tempL = String.valueOf(num);
                    answer += "L";
                } else {
                    if (hand.equals("right")) {
                        tempR = String.valueOf(num);
                        answer += "R";
                    } else {
                        tempL = String.valueOf(num);
                        answer += "L";
                    }
                }
            }
        }
        
        return answer;
    }
}