class Solution {
    public int solution(int n) {
        int answer = 0;
        String binaryN = Integer.toString(n, 2);
        // binaryString의 "1" 개수
        int countN = 0;
        for (int i=0;i<binaryN.length();i++) {
            if (binaryN.charAt(i) == '1') countN++;
        }
        
        for (int i=n+1;;i++) {
            String binary = Integer.toString(i, 2);
            int count = 0;
            
            for (int j=0;j<binary.length();j++) {
                if (binary.charAt(j) == '1') count++;
            }
            
            if (count == countN) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}