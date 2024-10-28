import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ",test_case);
            
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int maxLength = Math.max(num1, num2);
            int minLength = Math.min(num1, num2);
            
            Integer[] minLengthArr = new Integer[minLength];
            Integer[] maxLengthArr = new Integer[maxLength];
            if (num1 < num2) {
                for (int i=0;i<minLength;i++) {
                    minLengthArr[i] = sc.nextInt();
                }

                for (int i=0;i<maxLength;i++) {
                    maxLengthArr[i] = sc.nextInt();
                }
            } else {
                for (int i=0;i<maxLength;i++) {
                    maxLengthArr[i] = sc.nextInt();
                }

                for (int i=0;i<minLength;i++) {
                    minLengthArr[i] = sc.nextInt();
                }
            }
            
            int repeat = maxLength - minLength +1; // 계산할 때 반복 횟수
            
            int resultMax = Integer.MIN_VALUE;
            for (int i=0;i<repeat;i++) {
                int sum = 0;
                
                for (int j=0;j<minLengthArr.length;j++) {
                    int mul = minLengthArr[j]*maxLengthArr[j+i];
                    
                    sum+=mul;
            	}
                
                // 결과 최댓값 구하기
                resultMax = Math.max(resultMax, sum);
            }
            
            System.out.println(resultMax);
		}
	}
}