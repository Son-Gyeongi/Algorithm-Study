class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        /*
        XYZ 마트는 일정한 금액을 지불하면 10일 동안 회원 자격
        XYZ 마트에서는 회원을 대상으로 매일 한 가지 제품을 할인하는 행사
        할인하는 제품은 하루에 하나씩만 구매 가능
        -- 자신이 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 맞춰서 회원가입 --        
        */
        
        // 순서가 중요
        // 길이 중요 - 14일 간 할인 중에 6일 이후에는 연속 할인 못 받음
        int length = discount.length - 10 + 1;
        for (int i=0;i<length;i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int j=i;j<i+10;j++) {
                sb.append(discount[j]);
            }
            
            for (int j=0;j<want.length;j++) {
                String wantStr = want[j];
                int wantNum = number[j];
                
                for (int r=0;r<wantNum;r++) {
                    // String에서 replace() 기능을 StringBuilder에서 구현하려고 한다.
                    int start = sb.indexOf(wantStr);
                    if (start != -1) {
                        int end = start + wantStr.length();
                        sb.replace(start, end, "");
                    }
                }
            }
            
            if (sb.length() == 0) answer++;
        }
        
        return answer;
    }
}