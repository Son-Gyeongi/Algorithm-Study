class Solution {
    public boolean solution(String s) {
        if (!(s.length() == 4 || s.length() == 6)) {
            return false;
        }
        String[] strArr = s.split("[0-9]");
        return strArr.length == 0 ? true : false;
    }
}