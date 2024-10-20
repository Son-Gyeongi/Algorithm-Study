import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String T;
		T=sc.next();
        
        String[] alphabet = {"", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String answer = "";
		for (int i=0;i<T.length();i++) {
            String str = "" + T.charAt(i);
            
            for (int j=0;j<alphabet.length;j++) {
                if (str.equals(alphabet[j]) && i==0) System.out.print(j);
                else if (str.equals(alphabet[j])) System.out.print(" "+j);
            }
        }
	}
}