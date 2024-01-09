class Solution {
    public String solution(String[] arr) {
//        return Arrays.stream(arr).collect(Collectors.joining());
        return String.join("", arr);
    }
}