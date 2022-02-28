class Solution {

    public int orangesRotting(int[][] grid) {
        Queue<int[] > rotten = new LinkedList<>();
        int tot=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                    rotten.offer(new int[]{i,j});
                if(grid[i][j]!=0)
                    tot++;
            }
        }
        if(tot==0)
            return 0;
        int min=0,noRotted=0;
        int dx[]={0,0,-1,1};
        int dy[]={-1,+1,0,0};

        while(!rotten.isEmpty())
        {
            int currRotten=rotten.size();
            noRotted+=currRotten;
            for(int i=0;i<currRotten;i++)
            {
                int p[]=rotten.poll();
                for(int j=0;j<4;j++)
                {
                    int x=p[0]+dx[j];
                    int y=p[1]+dy[j];
                    if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==0 || grid[x][y]==2)
                        continue;
                    grid[x][y]=2;
                    rotten.offer(new int[] {x,y});
                }            
            }
            if(rotten.size()!=0)
                min++;
        }
        if(noRotted==tot)
            return min;
        return -1;
    }
}