import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int length = Math.max(bin1.length(), bin2.length());        
        String[] sum = new String[length];
        
        int diff = 0;
        // bin1, bin2 크기가 다를 경우
        if (length == bin1.length()) {
            // bin2의 길이가 bin1의 길이보다 적다.
            diff = bin1.length() - bin2.length();
            
            for (int i=0;i<diff;i++) {
                bin2 = "0" + bin2;
            }
        } else {
            // bin1의 길이가 bin2의 길이보다 적다.
            diff = bin2.length() - bin1.length();
            
            for (int i=0;i<diff;i++) {
                bin1 = "0" + bin1;
            }
        }
        
        String[] bin1Arr = bin1.split("");
        String[] bin2Arr = bin2.split("");
        String roundNumber = "0";
        
        for (int i=sum.length -1;i>=0;i--) {
            // 올림자리수가 1일 경우
            if (roundNumber.equals("1")) {
                if (bin1Arr[i].equals("1") && bin2Arr[i].equals("1")) {
                    // 1+1+1 => 11
                    sum[i] = "1";
                    roundNumber = "1";
                } else if (bin1Arr[i].equals("1") && bin2Arr[i].equals("0")) {
                    // 1+0+1 => 10
                    sum[i] = "0";
                    roundNumber = "1";
                } else if (bin1Arr[i].equals("0") && bin2Arr[i].equals("1")) {
                    // 0+1+1 => 10
                    sum[i] = "0";
                    roundNumber = "1";
                } else {
                    // 0+0+1 => 1
                    sum[i] = "1";
                    roundNumber = "0";
                }
            } else {
                if (bin1Arr[i].equals("1") && bin2Arr[i].equals("1")) {
                    // 1+1+0 => 10
                    sum[i] = "0";
                    roundNumber = "1";
                } else if (bin1Arr[i].equals("1") && bin2Arr[i].equals("0")) {
                    // 1+0+0 => 1
                    sum[i] = "1";
                    roundNumber = "0";
                } else if (bin1Arr[i].equals("0") && bin2Arr[i].equals("1")) {
                    // 0+1+0 => 1
                    sum[i] = "1";
                    roundNumber = "0";
                } else {
                    sum[i] = "0";
                    roundNumber = "0";
                }
            }
        }
        
        answer = String.join("", sum);
        
        if (roundNumber.equals("1")) {
            answer = "1" + answer;
        }
        
        return answer;
    }
}