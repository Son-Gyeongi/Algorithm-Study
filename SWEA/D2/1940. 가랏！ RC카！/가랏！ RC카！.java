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
            System.out.printf("#%d ", test_case);
            
            int N = sc.nextInt(); // N초
            
            int distance = 0; // 이동거리
            int currentSpeed = 0; // 현재 속도
            for (int i=0;i<N;i++) {                
                int command = sc.nextInt(); // 명령
                
                if (command == 0) {
                    distance += currentSpeed;
                    continue;
                }
                
                int acceleration = sc.nextInt(); // 가속도
                
                // 현재 속도보다 감속할 속도가 더 클 경우, 속도는 0 m/s 가 된다.
                if (command == 2 && currentSpeed < acceleration) {
                    currentSpeed = 0;
                    continue;
                }
                
                // RC 카 현재 속도 구하기
                if (command == 1) currentSpeed += acceleration;
                else currentSpeed -= acceleration;
                
                // 이동거리 구하기
                distance += currentSpeed;
            }                
            
            System.out.println(distance);
		}
	}
}