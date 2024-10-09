import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        // 문자열 배열 - 사전 순 오름차순
        Arrays.sort(phone_book);
        
        // 문자열 배열 앞 뒤로 비교
        for (int i=0;i<phone_book.length - 1;i++) {
            String number1 = phone_book[i];
            int length = number1.length();
            
            String number2 = phone_book[i+1];
            
            if (number1.length() <= number2.length()) {
                if (number1.equals(number2.substring(0, length))) return false;
            }
        }
        
        return true;
    }
}