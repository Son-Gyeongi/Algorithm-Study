class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Sum =0;
        int arr2Sum =0;

        if (arr1.length > arr2.length) return 1;
        else if (arr1.length < arr2.length) return -1;

        for (int i = 0; i < arr1.length; i++) {
            arr1Sum += arr1[i];
            arr2Sum += arr2[i];
        }

        // arr1Sum > arr2Sum ? 1 : arr1Sum < arr2Sum ? -1 : 0
        return Integer.compare(arr1Sum, arr2Sum);
    }
}