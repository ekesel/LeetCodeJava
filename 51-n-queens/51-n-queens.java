class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] arr = new boolean[n][n];
        int row = 0;
        List<List<String>> ans = new ArrayList<>();
        return helper(arr, row, ans);  
    }
     boolean modify(boolean[][] arr, int r, int c) {
        int L = Math.min(r, c);
        int R = Math.min(r, arr.length - c - 1);
        for (int i = 1; i <= L; i++) {
            if (arr[r - i][c - i]) {
                return false;
            }
        }
        for (int i = 0; i < r; i++) {
            if (arr[i][c]) {
                return false;
            }
        }
        for (int i = 1; i <= R; i++) {
            if (arr[r - i][c + i]) {
                return false;
            }

        }
        return true;
    }
    List<List<String>> helper(boolean[][] arr, int row, List<List<String>> ans) {
        List<String> Internal = new ArrayList<>();
        String p = "";
        if (row == arr.length) {
            for (boolean[] i : arr) {
                p = "";
                for (boolean j : i) {
                    if (j)
                        p += "Q";
                    else
                        p += ".";
                }
                Internal.add(p);
            }
            ans.add(Internal);
        }
        for (int col = 0; col < arr.length; col++) {

            if (modify(arr, row, col)) {
                arr[row][col] = true;
                helper(arr, row + 1, ans);
                arr[row][col] = false;
            }

        }
        return ans;
    }
}