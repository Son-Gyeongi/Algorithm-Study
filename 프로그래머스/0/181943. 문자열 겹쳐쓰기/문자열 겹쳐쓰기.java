class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String[] myStr = my_string.split("");
        String[] overStr = overwrite_string.split("");
        int j = 0;

        for (int i = s; i<overwrite_string.length()+s; i++) {
            myStr[i] = overStr[j];
            j++;
        }

        return String.join("", myStr);
    }
}