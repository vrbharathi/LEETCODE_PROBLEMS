class Solution {
     int diff[][]=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
    private int dfs(int R,int C,int row, int col,int matrix[][],int dp[][]){
        
       if(dp[row][col]!=0){
        return dp[row][col];
       }
        int ctr=0;
         for(int i=0;i<4;i++){
         int ar=row+diff[i][0];
         int ac=col+diff[i][1];
         
         if((ar>=0 && ar<R && ac>=0 && ac<C)&&(matrix[ar][ac]>matrix[row][col])){
                ctr=Math.max(ctr,dfs(R,C,ar,ac,matrix,dp));
           }
         }
    dp[row][col]=ctr+1;
    return dp[row][col];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        int dp[][]=new int[R][C];
        int maxLen=0;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                maxLen=Math.max(maxLen,dfs(R,C,row,col,matrix,dp));
            }
        }
        return maxLen;
            }
}
