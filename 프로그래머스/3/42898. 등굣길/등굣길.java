class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[m+1][n+1]; // n x m 을 한칸씩 더해서 새로운 배열 만듦
        for(int i=0;i<puddles.length;i++){
            dp[puddles[i][0]][puddles[i][1]]=-1;
        }
        dp[1][1]=1; 
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(dp[i][j]==-1){
                    dp[i][j]=0; // 새롭게 0을 주는 거도 괜찮군
                    continue;
                }
                if(i!=1)    dp[i][j]+=dp[i-1][j]%1000000007;
                if(j!=1)    dp[i][j]+=dp[i][j-1]%1000000007;
            }
        }
        return dp[m][n]%1000000007;
    }
}