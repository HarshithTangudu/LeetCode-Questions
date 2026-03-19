class Solution {

    public void dfs(char[][] grid, int i, int j, int[][] visited) {
        int m = grid.length;
        int n = grid[0].length;

        // boundary + invalid cases
        if (i < 0 || j < 0 || i >= m || j >= n || 
            grid[i][j] == '0' || visited[i][j] == 1) {
            return;
        }

        // mark visited
        visited[i][j] = 1;

        // explore all 4 directions
        dfs(grid, i - 1, j, visited);
        dfs(grid, i + 1, j, visited);
        dfs(grid, i, j - 1, visited);
        dfs(grid, i, j + 1, visited);
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] visited = new int[m][n];
        int count = 0;

        // traverse entire grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // new island found
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    count++;              // count island
                    dfs(grid, i, j, visited); // mark full island
                }
            }
        }

        return count;
    }
}