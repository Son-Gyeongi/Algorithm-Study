import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.printf("#%d ",test_case);
            int N = sc.nextInt();
            
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<N;i++) {
                list.add(sc.nextInt());
            }
            // System.out.println(list);
            
            int M = sc.nextInt();
            for (int i=0;i<M;) {
                String command = sc.next();
                
                if (command.equals("I")) { // 중간 삽입
                    int index = sc.nextInt();
                    int num = sc.nextInt();
                    
                    int count = 0;
                    List<Integer> tempList = new ArrayList<>();
                    while (count < num) {
                        tempList.add(sc.nextInt());
                        count++;
                    }
                    
                    list.addAll(index, tempList);
                    i++;
                } else if (command.equals("D")) { // 삭제
                    int index = sc.nextInt();
                    int num = sc.nextInt();
                    
                    int count = 0;
                    while (count < num) {
                        list.remove(index);
                        count++;
                    }
                    
                    i++;
                } else { // 맨 끝 삽입
                    // "A"
                    int num = sc.nextInt();
                    
                    int count = 0;
                    while (count < num) {
                        list.add(sc.nextInt());
                        count++;
                    }
                    
                    i++;
                }
            }
            
            for (int i=0;i<10;i++) System.out.print(list.get(i)+" ");
            
            System.out.println();
		}
	}
}