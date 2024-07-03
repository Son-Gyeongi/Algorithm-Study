import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1Str = new String[n];
        String[] arr2Str = new String[n];
        
        // 1. arr1, arr2 배열의 각 요소를 이진수로 만들기
        // 1-1. 10진수를 2진수로 만드는 방법 : Integer.toBinaryString(8); // 1000
        // 1-2. String.valueOf() 로 정수형을 문자형으로 바꾸기
        // 1-3. 그런데 n자리처럼 만들어야 함 - 예시) 27을 이진수로 바꾸면 11011인데 n이 6개면 011011이 되어야 함
        for (int i=0;i<n;i++) {
            // arr1 배열 -> arr1Str 배열 [101110, 100001, 100001, 010110, 011111, 110010]
            arr1Str[i] = String.valueOf(Integer.toBinaryString(arr1[i])).length() == n
                ? String.valueOf(Integer.toBinaryString(arr1[i]))
                : "0".repeat(n-String.valueOf(Integer.toBinaryString(arr1[i])).length())
                    + String.valueOf(Integer.toBinaryString(arr1[i]));
            
            // arr2 배열 -> arr2Str 배열 [011011, 111000, 010011, 001110, 001110, 001010]
            arr2Str[i] = String.valueOf(Integer.toBinaryString(arr2[i])).length() == n
                ? String.valueOf(Integer.toBinaryString(arr2[i]))
                : "0".repeat(n-String.valueOf(Integer.toBinaryString(arr2[i])).length())
                    + String.valueOf(Integer.toBinaryString(arr2[i]));
        }
        
        // 2. arr1Str, arr2Str 배열에 1을 벽(#) 으로 0을 공백(" ")으로 바꾸기
        for (int i=0;i<n;i++) {
            arr1Str[i] = arr1Str[i].replace("1", "#");
            arr1Str[i] = arr1Str[i].replace("0", " ");
            
            arr2Str[i] = arr2Str[i].replace("1", "#");
            arr2Str[i] = arr2Str[i].replace("0", " ");
        }
        
        // System.out.println(Arrays.toString(arr1Str)); // [# ### , #    #, #    #,  # ## ,  #####, ##  # ]
        // System.out.println(Arrays.toString(arr2Str)); // [ ## ##, ###   ,  #  ##,   ### ,   ### ,   # # ]
        
        // 3. arr1Str, arr2Str 배열을 보고 answer[n]에 알맞는 값 넣기
        for (int i=0;i<n;i++) {
            String temp = "";
            for (int j=0;j<n;j++) {
                if (arr1Str[i].charAt(j) == '#' || arr2Str[i].charAt(j) == '#')
                    temp += "#";
                else temp += " ";
            }
            
            answer[i] = temp;
        }
        
        return answer;
    }
}