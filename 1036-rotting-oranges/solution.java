class Solution {
    public int orangesRotting(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int min=-1;
        int good=0;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]==2){
                    q.add(new int[]{row,col});
                }else if(grid[row][col]==1){
                    ++good;
                }
            }
        }
        if(good==0)
           return 0;
        int diff[][]=new int [][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            min++;
            int qsize=q.size();
            for(int ctr=1;ctr<=qsize;ctr++){
                int cell[]=q.poll();
                int row=cell[0],col=cell[1];
        for(int i=0;i<4;i++){
         int ar=row+diff[i][0];
         int ac=col+diff[i][1];
          if(ar>=0 && ar<R && ac>=0 && ac<C){
            if(grid[ar][ac]==1){
                q.add(new int[]{ar,ac});
                grid[ar][ac]=0;
                --good;
        }
    }
}
    }
        }
        return good==0? min:-1;
    }
}
