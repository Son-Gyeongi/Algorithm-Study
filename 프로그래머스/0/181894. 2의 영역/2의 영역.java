import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int start = 0; // 배열 인덱스 값
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }

        // arr[0]에 2가 있어서 0일 수도 있고 아무것도 탐지 안해서 0일 수도 있구나 허르
        if (start == 0 && arr[0] != 2) return new int[]{-1};

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }

        if (start == end) return new int[]{2};

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}