class Solution {
    public int solution(int[] num_list) {
        int count = 0;

        for (int num : num_list) {
            int n = num;
            while (n > 1) {
                if (n % 2 == 0) n /= 2;
                else n = (n - 1) / 2;
                count++;
            }
        }

        return count;
    }
}