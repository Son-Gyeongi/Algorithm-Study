import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        // 숫자를 문자열로 변환한 뒤 '3,6,9' 가 포함되는지 확인하기
		for (int i=1;i<=T;i++) {            
            if (i < 10) {
                if (String.valueOf(i).equals("3") || String.valueOf(i).equals("6") || String.valueOf(i).equals("9")) System.out.print("- ");
                else System.out.print(i+" ");
            } else if (i < 100) {
                cal(i, 2);
            } else if (i < 1000) {
                cal(i, 3);
            } else if (i == 1000) {
                cal(i, 4);
            }
        }
	}
    
    public static void cal(int i, int length) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[length];
        int mok = i;

        for (int j=0;j<length;j++) {
            strArr[j] = String.valueOf(mok%10);
            mok = mok/10;
        }

        for (int k=0;k<strArr.length;k++) {
            if (strArr[k].equals("3") || strArr[k].equals("6") || strArr[k].equals("9")) sb.append("-");
        }

        if (sb.length() == 0) System.out.print(i +" ");
        else System.out.print(sb + " ");
    }
}