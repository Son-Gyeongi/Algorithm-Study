import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int[] arr = new int[7];
            Set<Integer> set = new TreeSet<>();
            
            for (int i=0;i<7;i++) arr[i] = sc.nextInt();
            
            for (int i=0;i<5;i++) {
                for (int j=i+1;j<6;j++) {
                    for (int k=j+1;k<7;k++) {
                        set.add(arr[i]+arr[j]+arr[k]);
                    }
                }
            }
            
            List list = new ArrayList<>(set);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println("#"+test_case+" "+list.get(4));
		}
	}
}