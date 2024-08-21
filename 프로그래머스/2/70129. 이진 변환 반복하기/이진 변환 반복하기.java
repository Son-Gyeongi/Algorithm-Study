class Solution {    
    public int[] solution(String s) {
        int count = 0; // 이진 변환 횟수
        int zeroCount = 0; // 제거된 0의 갯수        
        
        while (!s.equals("1")) {
            int sLength = s.length(); // "1", "0" 의 개수
            String sOne = s.replace("0", ""); // 0 제거한 String
            int sOneLength = sOne.length(); // "1"만 있는 개수

            int withoutZero = sLength - sOneLength; // 0 제거 후 길이
            
            if (withoutZero != 0) zeroCount += withoutZero;
            
            s = Integer.toString(sOneLength, 2); // 이진수로 변환
            count++;
        }
        
        int[] answer = {count, zeroCount};
        
        return answer;
    }
}