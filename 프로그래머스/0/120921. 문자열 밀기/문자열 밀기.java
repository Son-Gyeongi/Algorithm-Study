class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;
        
        String[] arrA = A.split("");
        String[] strArr = new String[arrA.length];
        
        for (int i=1;i<arrA.length;i++) { // 밀려나는 숫자
            for(int j=0;j<arrA.length;j++) {
                if (j+(arrA.length-i) < arrA.length) {
                    strArr[j] = arrA[j+(arrA.length-i)]; // 밀려서 앞으로 오는 문자열
                } else {
                    strArr[j] = arrA[j-i]; // 밀려서 뒤로 가는 문자열
                }
            }
            
            String strJoin = String.join("", strArr);
            
            if (B.equals(strJoin)) return i;
            
        }
        
        return -1;
    }
}