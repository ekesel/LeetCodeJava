// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> paths = new ArrayList<>();
       findAllPathsInMaze(m, 0, 0, paths, "");
       return paths;
   }
   
   static void findAllPathsInMaze(int[][] maze, int i, int j, ArrayList<String> paths, String path) {
       if (i < 0 || j < 0 || i > maze.length - 1 || j > maze.length - 1 || maze[i][j] == 0) {
         return;
       }
       if (i == maze.length - 1 && j == maze.length - 1) {
           paths.add(path);
       }
   
       maze[i][j] = 0;
       findAllPathsInMaze(maze, i + 1, j, paths, path+"D");
       findAllPathsInMaze(maze, i, j + 1, paths, path+"R");
       findAllPathsInMaze(maze, i - 1, j, paths, path+"U");
       findAllPathsInMaze(maze, i, j - 1, paths, path+"L");
       maze[i][j] = 1;
   }
}