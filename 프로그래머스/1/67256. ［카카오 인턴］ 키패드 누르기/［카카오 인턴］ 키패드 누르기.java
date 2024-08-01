class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        // 키패드의 각 숫자에 대한 좌표 설정
        int[][] keyPad = {
            {3, 1}, // 0
            {0, 0}, // 1
            {0, 1}, // 2
            {0, 2}, // 3
            {1, 0}, // 4
            {1, 1}, // 5
            {1, 2}, // 6
            {2, 0}, // 7
            {2, 1}, // 8
            {2, 2}, // 9
            {3, 0}, // *
            {3, 2}, // #
        };
        
        // 현재 왼손과 오른손의 위치를 키패드의 좌표로 설정
        int[] leftPos = {3,0}; // '*' 위치
        int[] rightPos = {3,2}; // '#' 위치
        
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftPos = keyPad[number];                
            } else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightPos = keyPad[number];
            } else {
                // 2, 5, 8, 0 인 경우
                int[] targetPos = keyPad[number];
                int leftDist = Math.abs(targetPos[0] - leftPos[0])
                    + Math.abs(targetPos[1] - leftPos[1]);
                int rightDist = Math.abs(targetPos[0] - rightPos[0])
                    + Math.abs(targetPos[1] - rightPos[1]);
                
                if (leftDist < rightDist) {
                    answer += "L";
                    leftPos = targetPos;
                } else if (leftDist > rightDist) {
                    answer += "R";
                    rightPos = targetPos;
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        rightPos = targetPos;
                    } else {
                        answer += "L";
                        leftPos = targetPos;
                    }
                }
            }
        }
        
        return answer;
    }
}