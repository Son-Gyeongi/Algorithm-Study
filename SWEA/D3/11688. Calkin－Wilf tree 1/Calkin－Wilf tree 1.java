import java.util.Scanner;

class Solution
{
    public static int[] result = new int[2];
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ",test_case);
            
            String str = sc.next();
            calkinWilfTree(str, 1, 1, 0);
            
            System.out.println(result[0] +" " +result[1]);
		}
	}
    
    public static void calkinWilfTree(String str, int a, int b, int index) {
        if (index == str.length()) {
            result[0] = a;
            result[1] = b;
            return;
        }
        
        if (str.charAt(index) == 'L') {
            b = a+b;
        } else {
            a = a+b;
        }
        
        index++;
        
        calkinWilfTree(str, a, b, index);
    }
}