# Python

```python
        
```

<br />
<br />
<br />

# JS

```

```

<br />
<br />
<br />

# JAVA
```java
class Solution {

    public int f(int i, int j, int[][] matrix) {
        if (i == 0 && j == 0)
            return matrix[i][j];
        if (i < 0 || j < 0)
            return (int) Math.pow(10, 9);

        int up = matrix[i][j] + f(i - 1, j, matrix);
        int left = matrix[i][j] + f(i, j - 1, matrix);

        return Math.min(up, left);

    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        return f(m - 1, n - 1, grid);
    }
}

/////////////////////////////////////////////


import java.util.Arrays;

class Solution {

    public int f(int i, int j, int[][] matrix, int[][] dp) {
        if (i == 0 && j == 0)
            return matrix[i][j];
        if (i < 0 || j < 0)
            return (int) Math.pow(10, 9);
        
        if (dp[i][j] != -1) return dp[i][j];  

        int up = matrix[i][j] + f(i - 1, j, matrix, dp);
        int left = matrix[i][j] + f(i, j - 1, matrix, dp);

        dp[i][j] = Math.min(up, left);
        return Math.min(up, left);

    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row: dp){
            Arrays.fill(row, -1);
        }

        return f(m - 1, n - 1, grid, dp);
    }
}

//////////////////////////////////////////////////


class Solution {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j]; // Base case: Start point
                } else {
                    int up = (i > 0) ? dp[i - 1][j] : Integer.MAX_VALUE; // If `i == 0`, no upward path
                    int left = (j > 0) ? dp[i][j - 1] : Integer.MAX_VALUE; // If `j == 0`, no leftward path
                    dp[i][j] = grid[i][j] + Math.min(up, left);
                }
            }
        }
        return dp[m - 1][n - 1]; // Bottom-right cell contains the answer
    }
}

/////////////////////////////////////////

class Solution {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] dp = new int[n];

        for (int i = 0; i < m; i++) {
            int[] temp = new int[n];

            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    temp[j] = grid[i][j]; // Base case: Start point
                } else {
                    int up = (i > 0) ? dp[j] : Integer.MAX_VALUE; // If `i == 0`, no upward path
                    int left = (j > 0) ? temp[j - 1] : Integer.MAX_VALUE; // If `j == 0`, no leftward path
                    temp[j] = grid[i][j] + Math.min(up, left);
                }
            }
            dp = temp;
        }
        return dp[n - 1]; // Bottom-right cell contains the answer
    }
}

```