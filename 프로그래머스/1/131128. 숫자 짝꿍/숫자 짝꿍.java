import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        String[] xArr = X.split("");
        String[] yArr = Y.split("");
        
        // 같은 숫자가 없는 경우 -1 반환
        // 같은 숫자가 0만 있는 경우 0 반환
        // 같은 숫자를 찾아서 오름차순으로 보여주기
        
        // Map으로 X, Y에 있는 숫자 세기
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();
        for (int i=0;i<xArr.length;i++) {
            int value = xMap.getOrDefault(xArr[i], 0) + 1;
            xMap.put(xArr[i], value);
        }
        
        for (int i=0;i<yArr.length;i++) {
            int value = yMap.getOrDefault(yArr[i], 0) + 1;
            yMap.put(yArr[i], value);
        }
        
        // xMap, yMap에서 0부터 9까지 같은 숫자가 있는지 확인하기
        for (Integer i=9;i>=0;i--) {
            // int를 String으로 변환
            String str = String.valueOf(i); // Object 값을 String 형으로 변환
            // 숫자가 존재하는 지 확인 - 같은 숫자가 없을 경우 continue
            if (!xMap.containsKey(str) || !yMap.containsKey(str)) {
                continue;
            }
            
            int valueX = xMap.get(str);
            int valueY = yMap.get(str);
            
            if (answer.equals("") && str.equals("0")) {
                answer += "0";
                continue;
            }
            
            if (valueX == valueY) {
                answer += str.repeat(valueX);
            } else {
                // 최소값 구하기
                int min = Math.min(valueX, valueY);
                answer += str.repeat(min);
            }
        }
        
        if (answer.equals("")) answer = "-1";
        
        return answer;
    }
}