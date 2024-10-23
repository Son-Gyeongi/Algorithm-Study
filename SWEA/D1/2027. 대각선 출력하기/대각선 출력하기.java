class Solution
{
	public static void main(String args[]) throws Exception
	{
		String[] str = {"+", "+", "+", "+", "+"};
        
        for (int i=0;i<str.length;i++) {
            str[i] = "#";
            
            System.out.println(String.join("", str));
            str[i] = "+";
        }
	}
}