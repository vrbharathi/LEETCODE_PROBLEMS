class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
		dp[0][0]=grid[0][0];
		//First Row
		for(int col=1;col<n;col++) {
			dp[0][col]=dp[0][col-1]+grid[0][col];
		}
		//first Column
       for(int row=1;row<m;row++) {
    	   dp[row][0]=dp[row-1][0]+grid[row][0];
       }
       //Other rows and columns
       for(int row=1;row<m;row++) {
    	   for(int col=1;col<n;col++) {
    		   dp[row][col]=Math.min(dp[row][col-1],dp[row-1][col])+grid[row][col];
    	   }
       }
       
return dp[m-1][n-1];
    }
}
