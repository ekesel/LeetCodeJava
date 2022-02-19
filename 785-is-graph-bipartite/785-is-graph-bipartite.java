class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            color[i] = -1;
        }
        for(int i=0;i<graph.length;i++)
        {
            if(color[i] == -1)
            {
                if(!dfs(i,1, color,graph))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int v, int col, int[] colors, int[][] graph) {
        if (colors[v] == 1 - col) return false; 
        if (colors[v] == col) return true; 

        colors[v] = col;
        
        for (var neighbor: graph[v]) {
            if (!dfs(neighbor, 1 - col, colors, graph)) return false;
        }
        return true;
    }
}