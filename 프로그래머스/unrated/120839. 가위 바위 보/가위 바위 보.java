class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        // 가위는 2 바위는 0 보는 5로 표현
        for (int i = 0; i < rsp.length(); i++) {
            switch (String.valueOf(rsp.charAt(i))) {
                case "2" :
                    answer.append("0");
                    break;
                case "0" :
                    answer.append("5");
                    break;
                case "5" :
                    answer.append("2");
                    break;
                default : answer.append("");
            }
        }

        return answer.toString();
    }
}