class Solution {
    public int solution(String binomial) {
        int answer = 0;

        int a = Integer.parseInt(binomial.split(" ")[0]);
        String op = binomial.split(" ")[1];
        int b = Integer.parseInt(binomial.split(" ")[2]);

        switch (op) {
            case "+" :
                answer = a + b;
                break;
            case "-" :
                answer = a - b;
                break;
            case "*" :
                answer = a * b;
                break;
        }

        return answer;
    }
}