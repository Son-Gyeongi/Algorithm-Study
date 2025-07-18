import java.util.*;

class Solution {
    public static void ex(String expression, boolean[] isUsed, Stack<String> stack, List<Long> list) {
        String[] arr = expression.split(",");

        if (arr.length == 1) {
            list.add(Math.abs(Long.parseLong(expression)));
            return;
        }

        if (expression.contains("+") && !isUsed[0]) {
            isUsed[0] = true;

            for (int i=0;i<arr.length;i++) {
                if ("+".equals(arr[i])) {
                    long sum = Long.parseLong(stack.pop()) + Long.parseLong(arr[i+1]);
                    i++;
                    stack.push(""+sum);
                } else {
                    stack.push(arr[i]);
                }
            }

            // 배열 만들기
            String[] arrStr = new String[stack.size()];
            for (int i=stack.size()-1;i>=0;i--) {
                arrStr[i] = stack.pop();
            }
            // 배열 합치기
            String strJoin = String.join(",",arrStr);
            ex(strJoin, isUsed, stack, list);
            isUsed[0] = false;
        }

        if (expression.contains("-") && !isUsed[1]) {
            isUsed[1] = true;

            for (int i=0;i<arr.length;i++) {
                if ("-".equals(arr[i])) {
                    long min = Long.parseLong(stack.pop()) - Long.parseLong(arr[i+1]);
                    i++;
                    stack.push(""+min);
                } else {
                    stack.push(arr[i]);
                }
            }

            // 배열 만들기
            String[] arrStr = new String[stack.size()];
            for (int i=stack.size()-1;i>=0;i--) {
                arrStr[i] = stack.pop();
            }
            // 배열 합치기
            String strJoin = String.join(",",arrStr);
            ex(strJoin, isUsed, stack, list);
            isUsed[1] = false;
        }

        if (expression.contains("*") && !isUsed[2]) {
            isUsed[2] = true;

            for (int i=0;i<arr.length;i++) {
                if ("*".equals(arr[i])) {
                    long mul = Long.parseLong(stack.pop()) * Long.parseLong(arr[i+1]);
                    i++;
                    stack.push(""+mul);
                } else {
                    stack.push(arr[i]);
                }
            }

            // 배열 만들기
            String[] arrStr = new String[stack.size()];
            for (int i=stack.size()-1;i>=0;i--) {
                arrStr[i] = stack.pop();
            }
            // 배열 합치기
            String strJoin = String.join(",",arrStr);
            ex(strJoin, isUsed, stack, list);
            isUsed[2] = false;
        }
    }

    public long solution(String expression) {
        List<Long> list = new ArrayList<>();

        // 연산자, 피연산자 구분하기
        expression = expression.replace("+", ",+,");
        expression = expression.replace("-",",-,");
        expression = expression.replace("*",",*,");
        ex(expression, new boolean[3], new Stack<>(), list);
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}