package StacksAndQueues;

public class NumberOfIslands {

    static void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if (i - 1 >= 0 && grid[i - 1][j] == '1')
            dfs(grid, i - 1, j);
        if (i + 1 < grid.length && grid[i + 1][j] == '1')
            dfs(grid, i + 1, j);
        if (j - 1 >= 0 && grid[i][j - 1] == '1')
            dfs(grid, i, j - 1);
        if (j + 1 < grid[0].length && grid[i][j + 1] == '1')
            dfs(grid, i, j + 1);
    }

    static public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };

        int noOfIslands = numIslands(grid);
        System.out.println("Number of Islands: " + noOfIslands);
    }
}